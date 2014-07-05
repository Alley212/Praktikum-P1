//Perintah Inherintance
//Kelas Turunannya

package Per09.bin;

public class TesKucingBesar {
	public static void main(String[] ali)  {
		Singa mySinga = new Singa ("SIMBABA SURAI");
		System.out.println("Singa merupakan " +Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau ("HARIMAU SUMATRA");
		System.out.println("Harimau merupakan " +Harimau.nama);
		myHarimau.Makan();
		}
	}