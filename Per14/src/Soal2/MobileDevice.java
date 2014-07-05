package Praktikum13b.bin;

public class MobileDevice{
	private String Os;
	private String Model;
	private String Vendor;
	
	public void setOs(String os){ this.Os = os; }
	public void setModel(String model){ this.Model = model; }
	public void setVendor(String vendor){ this.Vendor = vendor; }

	public String getOs(){ return this.Os; }
	public String getModel(){ return this.Model; }
	public String getVendor(){ return this.Vendor; }
}