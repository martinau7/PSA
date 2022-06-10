package factorymethod;

public class Ball extends ToyType {

	@Override
	public void prepare() {
		System.out.println("Sending a Ball");
	}

}
