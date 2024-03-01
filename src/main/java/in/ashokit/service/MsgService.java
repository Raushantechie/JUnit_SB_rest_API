package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg = "Welcome to the Ashok It";
		return msg;
	}

	public String getGreetMsg() {
		System.out.println("Msg from Greet Method");
		String msg = "Greeting from Ashok It";
		return msg;
	}
}
