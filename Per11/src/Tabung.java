package Praktikum10e.bin;

public class Tabung	{
	//Data Nasabah & info tabungan
	private String Nama;
	private int NoRek;
	private int Saldo;
	private int Pin;
	
	//Membuat objek Tabungan
	public Tabung(String NAMA, int NOREK)	{
		Nama = NAMA;
		NoRek = NOREK;
		Pin = 666666;
		}
		
	//Penyetoran Uang
	public void Simpan ( int Sal )	{
		Saldo = Saldo + Sal ;
		}
		
	//Tarik Uang
	public void Tarik ( int jmlTarik)	{
		Saldo = Saldo - jmlTarik;
		}
	
	//Info Saldo Tabungan
	public int getSaldo()	{
		return Saldo;
		}
		
	//Mengubah nilai awal Saldo
	public void SetSaldo (int Sal)	{
		Saldo = Sal;
		}
	
	//Mengubah Nomor PIN
	public void setPin (int PinBaru)	{
		Pin = PinBaru;
		}
	
	//Uji
	public static void main (String [] ali)	{
		int jmlTarik = 100000,jmlSimpan = 500000;
		Tabung TAB = new Tabung ("Mukhamat Ali",12345);
		System.out.println ("Saldo Awal adalah " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
		System.out.println ("Saldo Setelah Penarikan adalah " +TAB.getSaldo());
		TAB.Simpan(jmlSimpan);
		System.out.println ("Saldo Setelah disetor " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
	
		}
		
	}