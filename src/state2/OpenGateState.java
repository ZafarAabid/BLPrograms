package state2;

public class OpenGateState implements IGateState {
	IGate gate;
	
	public OpenGateState(IGate gate) {
		this.gate=gate;
	}
	public OpenGateState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void paid() {
		System.out.println("Lets Person to enter");
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub

	}


}
