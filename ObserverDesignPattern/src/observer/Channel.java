package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Subscriber> subs=new ArrayList<>();
	 String title;
	
	@Override
	public void subscribe(Subscriber sub)
	{
		subs.add(sub);
		
	}
	@Override
	public void unsubscribe(Observer sub)
	{
		subs.remove(sub);
	}
	@Override
	public void notifySubscribers()
	{
		for(Observer s:subs)
		{
			s.update();
		}
	}
	@Override
	public void Upload(String title)
	{
		this.title=title;
		notifySubscribers();
	}

}
