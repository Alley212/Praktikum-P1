//Perintah Object Oriented Programing

package Latihan01.Per08.bin;
import java.math.BigDecimal;

public class TransaksiDetail {
	private Barang barang;
	private Integer jumlah;
	
	public BigDecimal subtotal(){
		return barang.getHarga().multiply(new BigDecimal(jumlah));
	}
}