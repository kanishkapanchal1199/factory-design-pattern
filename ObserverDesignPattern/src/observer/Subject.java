package observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe(Observer sub);

	void notifySubscribers();

	void Upload(String title);

}