package state2;

public class Gate implements IGate {

	IGateState state;
	
	public Gate() {this.state= new ClosedGateState();}
	
	@Override
	public void enter() {
		this.state.enter();
	}

	@Override
	public void pay() {
		this.state.pay();		
	}

	@Override
	public void paid() {
		this.state.paid();		
	}

	@Override
	public void payFailed() {
		this.state.payFailed();		
	}

	public void changeState(IGateState state)
	{
		this.state=state;
	}
	
}
