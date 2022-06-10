package factorymethod;

public class Doll extends ToyType {
	@Override
	public void prepare() {
		System.out.println("Sending a Doll");
	}
}
