package Praktikum12e.bin;

public class TestMobil{
	public static void main(String[] ali){
		Mobil mobil = new Mobil(){
			public void injakPedalGas(){
				System.out.println("Mobil berjalan...");
			}
		};
		Kijang kijang = new Kijang();
		BMW bmw = new BMW();
		
		mobil.injakPedalGas();
		mobil = kijang;
		mobil.injakPedalGas();
		mobil = bmw;
		mobil.injakPedalGas();
	}
}