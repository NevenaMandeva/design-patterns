package chatbot;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements MessageMediator {

	private List<User> users;
	private Bot detectorBot;

	public Chatroom() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void sendChatMessage(User user, String message) {

		if ("addbot".equals(message.toLowerCase())) {
			detectorBot = Bot.addBot(this);
			sendToUsers(user, "MessageBot has been added in chat!");
			return;
		}

		if (detectorBot != null) {
			String announcement = Bot.addBot(this).checkMessage(user, message, users);
			sendToUsers(user, announcement);
			return;
		}

		sendToUsers(user, message);
	}

	@Override
	public void sendToUsers(User user, String message) {
		for (User chatUser : this.users) {
			if (user != chatUser)
				chatUser.receive(message);
		}
	}

}
