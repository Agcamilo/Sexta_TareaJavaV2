package Comercio;
import java.util.Scanner;

public class MetodoMain {

	public static void main (String [] args) {
		Scanner jin = new Scanner (System.in);

		Productos opc = new Productos();
		PesoPrecio price = new PesoPrecio();
		IngrDatos Datos = new IngrDatos();

		String condicion ="S";
		int PesoPrecioTotal=0,PrecioCompraTotal=0,PesoSuma=0;
		do {
			char pro = Datos.TipoProducto();	
			String color = Datos.ColorProducto(pro);
			int can= Datos.Cantidad();
					
			int precio = price.precio(color, pro);
			int peso = price.peso(color, pro);
			
			int preciototal=opc.getprice(precio, can);
			int pesototal=opc.getpeso(peso, can);
			
			PesoSuma+=pesototal;
			PrecioCompraTotal+=preciototal;
			
			System.out.println("Desea hacer otra compra? S/N");
			condicion = jin.next();
		}while(condicion.equalsIgnoreCase("S"));
		
		Transporte tarifa = new Transporte();
		PesoPrecioTotal = tarifa.tarifaTransporte(PesoSuma);
		
		System.out.println("EL COSTO DE LA COMPRA ES DE $"+PrecioCompraTotal);
		System.out.println("EL COSTO TOTAL DEL TRANSPORTE ES $"+PesoPrecioTotal);
	}	

}
