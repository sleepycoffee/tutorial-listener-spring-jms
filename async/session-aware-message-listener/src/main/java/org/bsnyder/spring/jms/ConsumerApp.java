package org.bsnyder.spring.jms;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class drives the example from the consumer side. It loads the Spring 
 * {@link ApplicationContext} and sends messages. The entire configuration for 
 * this app is held in <tt>src/main/resources/jms-context.xml</tt>. 
 * 
 * @author bsnyder
 *
 */
public class ConsumerApp {
	
    /**
     * Run the app and tell the producer to send its messages. 
     * 
     * @param args
     * @throws JMSException
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) throws JMSException {
    	
    	new ClassPathXmlApplicationContext("META-INF/spring/consumer-jms-context.xml");
    	
        // No need to actually do anything beyond loading the app context because
    	// this starts up the Spring message listener container. 
    }
    
}
