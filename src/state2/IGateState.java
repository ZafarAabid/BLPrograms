package state2;

public interface IGateState {
	void enter();
	void pay();
	void paid();
	void payFailed();
}
