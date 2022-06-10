package observer;

public class ObserverMain {

	public static void main(String[] args) {


		Toy helper = new Toy();
		Observer obs1 = new ToyPicker("Dasher the Helper");
		Observer obs2 = new ToyPicker("Prancer the Helper");
		Observer obs3 = new ToyPicker("Comet the Helper");
		Observer obs4 = new ToyPicker("Blitzen Tony the Helper");
		
		helper.add(obs1);
		/*helper.add(obs2);		Helpers that will accept the task to bring toys
		helper.add(obs3);
		helper.add(obs4);*/
		
		helper.setToy("Doll");
		helper.setToy("Car");
		/*helper.setToy("Wheel");	The type of toys Santa wants to be sent
		helper.setToy("Ball");*/
	}

}
