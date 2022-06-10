package factorymethod;

public class Wheel extends ToyType {

	@Override
	public void prepare() {
		System.out.println("Sending a Wheel");
	}

}
