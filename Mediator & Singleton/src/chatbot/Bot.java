package chatbot;

import java.util.List;

public class Bot {

	private static Bot botInstance;

	private Bot() {
		// TODO Auto-generated constructor stub
	}

	public static Bot addBot(Chatroom chat) {

		if (botInstance == null) {
			botInstance = new Bot();
		}

		return botInstance;
	}
	
	public String checkMessage(User user, String message, List<User> chatUsers) {
		
		if (message.toLowerCase().indexOf("cat") != -1) {
			chatUsers.remove(user);
			return "The word 'cat' is forbidden in this chat!\n" + user.name + " has been removed from the chat!";
		}
		
		return message;
	}
}
