package dependency;

import org.springframework.stereotype.Component;


@Component
public class SmsService implements MessageService {

	public SmsService() {
		System.out.println("In sms service");
	}
	@Override
	public void sendMessage(String message, String receipt) {
		System.out.println(message);

	}

}
