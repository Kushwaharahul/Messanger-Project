package dependency;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	public EmailService() {
		System.out.println("In Email service");
	}
	
	@Override
	public void sendMessage(String message, String receipt) {
		System.out.println(message);
	}

}
