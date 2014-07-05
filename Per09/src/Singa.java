//Perintah Inherintance
//Kelas Turunannya

package Per09.bin;

class Singa extends KucingBesar {
	
	//Konstruktor untuk kelas Singa
	public Singa(String namaSinga) {
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	Singa.nama = namaSinga;
	}
	
	//implementasi metode yang diwarisi dari kelas abstract
	public void Makan() {
	System.out.println("Singa makan daging");
	System.out.println();
	}
}