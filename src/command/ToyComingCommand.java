package command;

public class ToyComingCommand implements Command {
	
	private ToyInLine toyinline;
	
	public ToyComingCommand(ToyInLine toyinline) {
		this.toyinline = toyinline;
	}
	@Override
	public void execute() {
		this.toyinline.coming();
	}
}
