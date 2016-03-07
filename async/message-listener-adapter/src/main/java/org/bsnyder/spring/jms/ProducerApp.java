package org.bsnyder.spring.jms;

import javax.jms.JMSException;

import org.bsnyder.spring.jms.producer.MessageProducer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class drives the example from the producer side. It loads the Spring 
 * {@link ApplicationContext}  and sends messages. The entire configuration for 
 * this app is held in <tt>src/main/resources/jms-context.xml</tt>. 
 * 
 * @author bsnyder
 *
 */
public class ProducerApp {
	
    /**
     * Run the app and tell the producer to send its messages. 
     * 
     * @param args
     * @throws JMSException
     */
    public static void main(String[] args) throws JMSException {
    	
//    	if (args.length == 2) {
//    		destinationName = args[0];
//    		messageType = args[1];
//			LOG.debug("Using arguments destinationName: {}  messageType: {}", destinationName, messageType);
//		} else {
//			LOG.error("There must be two arguments, destinationName and messageType");
//		}
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/producer-jms-context.xml");
        MessageProducer producer = (MessageProducer) context.getBean("messageProducer");
        producer.sendMessages();
    }
    
}
