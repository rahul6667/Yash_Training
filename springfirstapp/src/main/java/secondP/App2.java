package secondP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springfirstapp.Employee;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Welcome to Spring First Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext2.xml");
		
		PrintMessage p=(PrintMessage) context.getBean("Message");
		System.out.println(p);
		
	}

}
