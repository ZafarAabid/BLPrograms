package factory.factoryPattern;

import factory.factorybeans.Computer;
import factory.factorybeans.*;

public class ComputerFactory {
	public static Computer creatComputer(ComputerType type, String ram, String hdd, String cpu) {
	Computer comp=null;
	switch(type)
	{
	case PC:
		comp =new Laptop(ram,hdd,cpu);
		break;
	case Laptop:
			comp =new Laptop(ram,hdd,cpu);
	break;
	
	case Server:
		comp =new Server(ram,hdd,cpu);
	break;
	
	}
	return comp;
}
}
