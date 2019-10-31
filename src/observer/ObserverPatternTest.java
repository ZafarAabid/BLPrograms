package observer;

/**	program to illustrate the concept of Observer pattern.
 * 	it is used when one class' behavior, lets say Observer is depend on the state of 
 * 	another class say Observable, so either we need to check it regularly either 
 * 	its changing its state or it(Observable) tells himself to the observer about its state. */
public class ObserverPatternTest {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}

}
