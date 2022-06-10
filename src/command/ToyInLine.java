package command;

public class ToyInLine {
private boolean newtoy;
	
	public void coming() {
		System.out.println("A toy is coming");
		this.newtoy = true;
	}
	
	public void notcoming() {
		System.out.println("A toy is not coming");
		this.newtoy = false;
	}
}
