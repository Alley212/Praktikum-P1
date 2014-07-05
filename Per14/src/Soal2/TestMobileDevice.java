package Praktikum13b.bin;

public class TestMobileDevice{
	public static void main(String[] ali){
		MobileDevice advan = new MobileDevice();
		advan.setOs("Android Jelly Bean");
		advan.setModel("Advan S5E");
		advan.setVendor("Advan");
		System.out.println("Vendor     : " + advan.getVendor());
		System.out.println("Model      : " + advan.getModel());
		System.out.println("OS         : " + advan.getOs());
	}
}