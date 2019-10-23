package state2;

public class EntryDoor {
	static IGate gate;
	static IGateState gatest=new OpenGateState();
	public static void main(String[] args) {
		IGateState state= new OpenGateState(gate);
		System.out.println(state.toString());
		state.paid();
	}

}
