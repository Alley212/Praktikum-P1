package Praktikum10c.bin;

public class Karyawan extends KomunitasPT	{
	private int noKaryawan;
	private int Gapok;
	
	//Inisialisasi
	Karyawan (String NAMA, String ALAMAT, String JK, int NOKARYAWAN, int GAPOK)	{
		super (NAMA, ALAMAT,JK);
		//Memanggil konstruktor superkelas
		noKaryawan = NOKARYAWAN;
		Gapok = GAPOK;
		}
	//Menampilkan Nomor Karywan dan Gaji Pokok
public void Tampilkan2 () 	{
	System.out.println ();
	System.out.println ( "Nomor Karyawan = " + noKaryawan);
	System.out.println ( "Gaji Pokok = " + Gapok);
	}
}