package state2;

public class ClosedGateState implements IGateState {
	IGate gate;
	public ClosedGateState() {};
	public ClosedGateState(IGate gate) {
		this.gate=gate;
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
		// TODO Auto-generated method stub
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub
	}

}
