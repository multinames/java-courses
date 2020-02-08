package app.integration;


import app.integration.dto.Request;
import app.integration.dto.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class ListenerRepository {
    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "JET.IN")
    public void receiveMessage(Message message) throws JMSException, JsonProcessingException {
        TextMessage textMessage = (TextMessage) message;
        ObjectMapper objectMapper = new ObjectMapper();
       Request request = objectMapper.readValue(textMessage.getText(), Request.class);
        //System.out.println(request);
        jmsTemplate.send("JET.OUT", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return  session.createTextMessage("Hello");
            }
        });
    }

}
