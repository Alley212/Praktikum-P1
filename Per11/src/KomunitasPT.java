package Praktikum10c.bin;

public class KomunitasPT	{
	protected String Nama;
	protected String Alamat;
	protected String Jk;
	
	//Inisialisasi 3 atribut
	KomunitasPT (String NAMA, String ALAMAT, String JK )	{
		Nama = NAMA;
		Alamat = ALAMAT;
		Jk = JK;
		}
		
	//Mencetak informasi yang dimiliki oleh komuunitas
	public void Tampilkan1 ()	{
		System.out.println ();
		System.out.println ("Nama		= " + Nama );
		System.out.println ("Alamat		= " + Alamat );
		System.out.println ("Jenis Kelamin	= " + Jk );
		
		}
	}
	