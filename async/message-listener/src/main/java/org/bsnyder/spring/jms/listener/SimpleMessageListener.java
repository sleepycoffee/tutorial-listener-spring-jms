package org.bsnyder.spring.jms.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.bsnyder.spring.jms.producer.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMessageListener implements MessageListener {
    
    private static final Logger LOG = LoggerFactory.getLogger(SimpleMessageListener.class);

    public void onMessage(Message message) {
        try {
//            LOG.info("Received message: {} ", ((TextMessage)message).getText());
//        	LOG.info("Received message: {} ", message.getIntProperty("messageCount"));
//
//        	LOG.info(((Payload)((ObjectMessage) message).getObject()).toString());
        	Payload payload = (Payload) ((ObjectMessage) message).getObject();
        	System.out.println(payload.getPayload());
        	
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }
}

