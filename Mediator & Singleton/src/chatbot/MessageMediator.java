package chatbot;

public interface MessageMediator {

	void addUser(User user);

	void sendChatMessage(User user, String message);

	void sendToUsers(User user, String message);
}
