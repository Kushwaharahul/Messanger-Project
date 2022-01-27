package dependency;

import org.springframework.stereotype.Component;

@Component("face")
public class FaceBookService implements MessageService {
	
	public FaceBookService() {
		System.out.println("in Facebook Service");
	}

	@Override
	public void sendMessage(String message, String receipt) {
		System.out.println(message+" "+receipt);

	}

}
