package state2;

public interface IGate {
	void enter();
	void pay();
	void paid();
	void payFailed();
	void changeState(IGateState state);
}
