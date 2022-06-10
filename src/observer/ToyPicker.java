package observer;

public class ToyPicker implements Observer {

	private String name;
	private Observable toy;

	public ToyPicker(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.toy == null) {
			System.out.println("No toy sent");
			return;
		}
		String toyPicked = this.toy.getUpdate();
		System.out.println(this.name + " sent: " + toyPicked);
	}


	@Override
	public void setToy(Observable toy) {
		this.toy = toy;
	}

}
