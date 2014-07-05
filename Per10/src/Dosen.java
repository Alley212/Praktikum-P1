package Praktikum09f.bin;

public class Dosen extends Orang	{
	//atribut untuk dosen
	private String NIDN = "";
	private String JJA = "";
	private float Honor;
	
	//metode constructor
	public Orang (String NM,int UMR,String ALMT,String STS,String NT,String ND,String JA,float HN)	{
		super (NM,UMR,ALMT,STS,NT);
		NIDN = ND;
		JJA = JA;
		Honor = HN;
		}
	
	//Modifier
	public void setNINDa ( String ND )	{
		this.NIND = ND;
		}
	public void setJJA ( int JA )	{
		this.JJA = JA;
		}
	public void setHonor ( float HN )	{
		this.Honor = HN;
		}
	
	//Accesor
	public String getNIND () {
		return NIND;
		}
	public int getJJA () {
		return JJA;
		}
	public int getHonor () {
		return Honor;
		}
	
	public String Display ()	{
		return "Nama " + Nama + "-Umurnya " + "-Alamat " + "-Status " + "-Nomor Telponnya " + NoTlp ; 
		}
}