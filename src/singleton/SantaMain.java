package singleton;

public class SantaMain {
	
	public static void main(String[] args) {
		Santa connection = Santa.getInstance();
		connection.postMessage(": Santa is here");
	}
}
