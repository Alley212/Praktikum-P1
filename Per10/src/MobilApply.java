package Praktikum09e.bin;

public class MobilApply	{
	public static void main (String [] ali)	{
		Jeep Mobil1 = new Jeep ("Jeep Tentara","B 63 ATO",180);
		Jeep Mobil2 = new Jeep ("Jeep Gunung","B 621 KLM",200);
		Jeep Mobil3 = new Jeep ("Jeep Pantai","B 645 IJO",150);
		
		Mobil1.JenisMobil (); Mobil1.Display();
		System.out.println ();
		Mobil2.JenisMobil (); Mobil2.Display();
		System.out.println ();
		Mobil3.JenisMobil (); Mobil3.Display();
		System.out.println ();
		}
	}