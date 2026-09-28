package SportsLobby;



import java.util.List;

public class CommentaryObject implements Subject,Commentary, Commercial
{

	private final List<Observer>observers;
	private String desc;
	private final String subjectDetails;
	/**
	 * commercialTitle stores commercial message
	 */
	private String commercialTitle;
	
	public CommentaryObject(List<Observer>observers,String subjectDetails){
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}
	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for(Observer observer : observers){
			observer.update(desc);
		}
		
	}
	
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}
	@Override
	public String subjectDetails() {
		return subjectDetails;
	}
	
	/**@author Hannah Reynolds 
	 * Sets current commercial title and displays/plays it
	 * Doesn't affect Observer Pattern functionality
	 * Doesn't notify observers / only displays/plays during match
	 * 
	 * @param title commercial title that's displayed
	 */
	@Override
	public void setCommercial(String title)
	{
		this.commercialTitle = title;
		System.out.println("Commercial playing: " + title);
	}
	

}
