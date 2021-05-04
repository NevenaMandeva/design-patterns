package chatbot;

public class MediatorMain {

	public static void main(String[] args) {

		MessageMediator chat = new Chatroom();

		User user1 = new ChatUser(chat, "Ella");
		User user2 = new ChatUser(chat, "Bella");
		User user3 = new ChatUser(chat, "Stella");

		user2.send("Hi, guys");
		user1.send("hey, how are you");
		user3.send("addBot");
		user2.send("cat?");
	}
}
