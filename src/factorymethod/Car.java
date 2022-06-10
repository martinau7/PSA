package factorymethod;

public class Car extends ToyType {

	@Override
	public void prepare() {
		System.out.println("Sending a Car");
	}

}
