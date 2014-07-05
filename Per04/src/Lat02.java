// Praktikum Soal 2
package Latihan01.sesi1.bin;

public class Lat02{
	private String nama;
	public static void main(String[] ali){
		Lat02 test;
		test = new Lat02();
		test.setNama("Ali"); 
		byte b = 100;
		short s = 100;
		
		Lat02 belajarVariabel = test;
		belajarVariabel.setNama("Belajar Variabel");
		
		System.out.println(b + s);
		System.out.println("Nama : " + test.getNama() + " " + b);
	}
	
	public void setNama(String aNama){
		this.nama = aNama;
	}
	
	public String getNama(){
		return this.nama;
	}
}