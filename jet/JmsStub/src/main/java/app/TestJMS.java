package app;

import com.sun.net.httpserver.Headers;
import com.sun.xml.internal.ws.api.message.Header;
import com.tibco.tibjms.TibjmsConnectionFactory;
import com.tibco.tibjms.TibjmsTopicConnectionFactory;

import javax.jms.*;
import java.util.ArrayList;
import java.util.List;

public class TestJMS {

    private String userName = "admin";
    private String password = "";
    private Connection connection = null;
    private Session session = null;
    private MessageProducer msgProducer = null;
    private Queue output = null;
    private Queue input = null;
    private MessageConsumer mc = null;
    private ConnectionFactory factory;

    private String serverUrl = "tcp://localhost:7222";

    public String sendMessage(String outputQueue,String msg, String CorID, String OperationName){
        try {
            factory = new TibjmsConnectionFactory(serverUrl);
            connection = factory.createConnection(userName, password);
            session = connection.createSession(javax.jms.Session.AUTO_ACKNOWLEDGE);
            output = session.createQueue(outputQueue);
            msgProducer = session.createProducer(null);
            TextMessage tmsg = session.createTextMessage();
            tmsg.setText(msg);
            tmsg.setJMSCorrelationID(CorID);
            tmsg.setStringProperty("OperationName",OperationName);

            msgProducer.send(output,tmsg);
            connection.close();
          return tmsg.getJMSMessageID();
       } catch (JMSException ex) {
            System.out.println("Error while send message");
        }
        return null;
        }

    public String getMessage(String Queue, String key, String value, int timeout){
        try {
            factory = new TibjmsConnectionFactory(serverUrl);
            connection = factory.createConnection(userName, password);
            session = connection.createSession(javax.jms.Session.AUTO_ACKNOWLEDGE);
            input = session.createQueue(Queue);
            mc = session.createConsumer(input, key+"='"+value+"'");
            connection.start();
            TextMessage msg2 = (TextMessage) mc.receive(timeout);
            mc.close();
            return msg2.getText();
        } catch (JMSException ex) {
            System.out.println("Error while receive message");
        }
        return null;
    }

}

