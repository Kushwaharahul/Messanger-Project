package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.MessageService;


@Component("message")
public class MSA implements MessageSendingApplication
{
	@Autowired
	@Qualifier("face")
	private MessageService msg;

	public MSA() 
	{
		//msg=face;
		System.out.println("In MSA");
		System.out.println("dependency"+msg);
	}
	
	@Override
	public void processMessage(String message, String recipient)
	{
		System.out.println("In ProcessMessage");
		msg.sendMessage(message,recipient );
		
	}
	
	
	/*public void setMsg(MessageService msg) {
		System.out.println("In Message Setter");
		this.msg = msg;
	}*/

	@PostConstruct
	public void myInit()
	{
		System.out.println("In My Init");
		System.out.println("dependency"+msg);
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("In My Destroy");
	}
}
