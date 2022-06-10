package factorymethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		ToyFactory toyfac = new ToyFactory();
	
		ToyType toy1 = toyfac.toytype("DOLL"); //Sending the toys
		ToyType toy2 = toyfac.toytype("BALL");
		ToyType toy3 = toyfac.toytype("CAR");
		ToyType toy4 = toyfac.toytype("WHEEL");
	}
		public void prepare() {
		}
}

