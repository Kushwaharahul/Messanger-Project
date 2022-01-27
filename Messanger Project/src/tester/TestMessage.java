package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.MessageSendingApplication;

public class TestMessage {

	public static void main(String[] args)
	{
		try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml"))
		{
			System.out.println("SC Started..........");
			MessageSendingApplication ref=ctx.getBean("message",MessageSendingApplication.class);
			ref.processMessage("I bow to my Lord", "Rahul Kushwaha");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
