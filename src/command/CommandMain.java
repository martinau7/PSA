package command;

public class CommandMain {

	public static void main(String[] args) {
		ToyInLine toyinline = new ToyInLine();
		Command toycoming = new ToyComingCommand(toyinline);
		Command toynotcoming = new ToyNotComingCommand(toyinline);

		RemoteController remote = new RemoteController();
		
		remote.setCommand(toycoming);//Sending out a toy 
		remote.pressButton();
		
		/*remote.setCommand(toynotcoming);
		remote.pressButton();*/
	}
	

}
