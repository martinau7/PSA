package observer;
import java.util.ArrayList;
import java.util.List;

public class Toy implements Observable {

	private List<Observer> observers;
	private String toy;
	
	public Toy() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		this.observers.add(observer);
		observer.setToy(this);
	}

	@Override
	public void remove(Observer observer) {
		this.observers.remove(observer);
		observer.setToy(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
		this.notifyObservers();
	}

}
