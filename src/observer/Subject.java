package observer;

public interface Subject {
	
	void list(Observer observer);
	void unlist(Observer observer);

	void notifyObservers();
	String getUpdate();
}
