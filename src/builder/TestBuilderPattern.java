package builder;
/**Piece of code to illustrate the concept how to use builder pattern.
 * its a step by step implementation of an object where user only concern about final
 * product but not how its get implemented*/
public class TestBuilderPattern {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.getHDD()+","+comp.getRAM());
	}

}
