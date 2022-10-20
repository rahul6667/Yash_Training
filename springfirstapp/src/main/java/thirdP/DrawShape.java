package thirdP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {


		

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext3.xml");
		Shape e=(Shape) context.getBean("rct");
		Shape e2=(Shape) context.getBean("trng");
		  e.draw();
		  e2.draw();

	}

}
