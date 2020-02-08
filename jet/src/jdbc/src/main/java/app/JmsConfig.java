package app;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
public class JmsConfig {
    private String broker = "tcp://localhost:61616";
    private  String user = "admin";
    private  String password = "admin";

    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(broker);
        factory.setUserName(user);
        factory.setPassword(password);
        return factory;
    }
    @Bean
    public JmsTemplate jmsTemplate(){
        JmsTemplate jms = new JmsTemplate();
        jms.setConnectionFactory(connectionFactory());
        return jms;
    }
    @Bean
    public DefaultJmsListenerContainerFactory jmsListener (){
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory());
        return factory;
    }
}
