package app.integration;

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
public class Listener {

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "ToOtherBank")
    public void receiveMessage(Message message) throws JMSException {
        TextMessage textMessage = (TextMessage) message;

        System.out.println("CorID " + textMessage.getJMSCorrelationID());


        jmsTemplate.send("FromOtherBank", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {

                TextMessage tmsg = session.createTextMessage("<accountTransferRs>\n" +
                        "    <description>Description</description>\n" +
                        "    <statusCode>1</statusCode>\n" +
                        "</accountTransferRs>\n");
                        ;
                tmsg.setJMSCorrelationID(textMessage.getJMSCorrelationID());
                return tmsg;
            }
        });

    }
}
