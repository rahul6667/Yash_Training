package fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import thirdP.Shape;

public class Callingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext4.xml");
		A e=(A) context.getBean("a");
		System.out.println(e);
		
		StrGtr e1=(StrGtr) context.getBean("message1");
		System.out.println(e1);
	}

}
