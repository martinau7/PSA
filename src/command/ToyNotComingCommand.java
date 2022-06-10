package command;

public class ToyNotComingCommand implements Command {

	private ToyInLine toyinline;
	@Override
	public void execute() {
		this.toyinline.notcoming();
		
	}
	public ToyNotComingCommand(ToyInLine toyinline) {
		this.toyinline = toyinline;
	}

}
