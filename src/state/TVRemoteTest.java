package state;

/** its a State design pattern program where we used working of TV remote to illustrate
 * 	the concept how the working of system changes by changing its state and how achive it in 
 * 	efficient manner*/
public class TVRemoteTest {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		//here switch button will work in different manner

		//lets consider TV is in OFF state and we are pressing switch button
		context.setState(tvStartState);
		context.doAction();
		
		System.out.println("'state changed but doing same action'");
		//similarly working of switch button when TV is ON state 
		context.setState(tvStopState);
		context.doAction();
		
	}

}
