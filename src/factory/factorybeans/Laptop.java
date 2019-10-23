package factory.factorybeans;

public class Laptop  implements Computer{
	private String RAM;
	private String HDD;
	private String CPU;
	
	public Laptop(String rAM, String hDD, String cPU) {
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}
	
}
