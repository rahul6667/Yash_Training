package com.yash.mavenAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/yash/mavenAOP/cofig.xml");
    	PaymentService paymentServiceobj=context.getBean("payment",PaymentService.class);
    	paymentServiceobj.makePayment();
        
    }
}
