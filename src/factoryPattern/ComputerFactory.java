package factoryPattern;

import factorybeans.Computer;
import factorybeans.*;

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
