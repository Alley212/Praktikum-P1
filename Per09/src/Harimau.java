//Perintah Inherintance
//Kelas Turunannya

package Per09.bin;

class Harimau extends KucingBesar {
	
	//Konstruktor untuk kelas Harimau
	public Harimau(String namaHarimau) {
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	Harimau.nama = namaHarimau;
	}
	
	//implementasi metode yang diwarisi dari kelas abstract
	public void Makan() {
	System.out.println("Harimau makan daging dan minum susu");
	System.out.println();
	}
}