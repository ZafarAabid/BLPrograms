package adapter;

/**program to illustrate the concept of design pattern strategy and how to use it*/
public class AdapterPatternTest {

	public static void main(String[] args) {

/**since we know that Strategy pattern have two way to implement it, that is
 * by inheritance(extending from base class) or by composition(creating object and using it),
 *  here we use composition strategy over inheritance*/		
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sAdapter,3);
		Volt v12 = getVolt(sAdapter,12);
		Volt v120 = getVolt(sAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	//main adaptor strategy of conversion
	private static Volt getVolt(SocketAdapter socketAd, int i) {
		switch (i){
		case 3: return socketAd.get3Volt();
		case 12: return socketAd.get12Volt();
		case 120: return socketAd.get120Volt();
		default: return socketAd.get120Volt();
		}
	}
}
