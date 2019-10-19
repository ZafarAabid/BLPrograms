package factorybeans;

public class PC  implements Computer{
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String rAM, String hDD, String cPU) {
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
