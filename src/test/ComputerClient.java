package test;

import factoryPattern.ComputerFactory;
import factoryPattern.ComputerType;
import factorybeans.Computer;

public class ComputerClient {
	
	public static void main(String[] args) {
		Computer laptop = ComputerFactory.creatComputer(ComputerType.Laptop,"4GB", "1TB", "2.4GHz");
		Computer pc = ComputerFactory.creatComputer(ComputerType.PC,"4GB", "1TB", "2.4GHz");
		Computer server = ComputerFactory.creatComputer(ComputerType.Server,"32GB", "100TB", "2.4GHz x 8");
	
		System.out.println("PC:"+pc.getRAM()+", "+pc.getHDD()+", "+pc.getCPU());
		System.out.println("server:"+server.getRAM()+", "+server.getHDD()+", "+server.getCPU());
		System.out.println("laptop:"+laptop.getRAM()+", "+laptop.getHDD()+", "+laptop.getCPU());
		
	}
}
