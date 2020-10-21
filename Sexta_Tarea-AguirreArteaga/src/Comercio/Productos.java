package Comercio;

public class Productos {
	private int pesogr;
	private int precio ;

	public int getprice(int p, int cant) {
		precio = p * cant;
		return precio;
	}
	
	public int getpeso(int n, int cant) {
		pesogr = n * cant;
		return pesogr;
	}
}
