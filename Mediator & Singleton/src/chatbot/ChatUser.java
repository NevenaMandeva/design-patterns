package chatbot;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sent: " + message);
		mediator.sendChatMessage(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
	}

}
