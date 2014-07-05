package Praktikum10d.bin;

class TesOverriding4{
	public static void main(String[] ali){
		KomunitasPT2 DtJRS = new KomunitasPT2("Teknik Informatika","Jakarta Selatan","LK");
		Karyawan2 KA = new Karyawan2("Mukhamat Ali S.T", "Depok","Pria",318,2000000);
		System.out.println();
		DtJRS.Tampilkan3();
		System.out.println();
		KA.Tampilkan3();
	}
}