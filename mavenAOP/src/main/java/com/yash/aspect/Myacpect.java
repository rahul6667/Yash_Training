package com.yash.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class Myacpect {

	
	@Before("execution(* com.yash.service.PaymentserviceImpl.makePayment())")
	public void printbefore() {
		System.out.println("running print before...");
	}
	
	
	@After("execution(* com.yash.service.PaymentserviceImpl.makePayment())")
	public void printafter() {
		System.out.println("running print after...");
	}

}
