package Comercio;
import java.util.Scanner;

public class IngrDatos {
	
	Scanner jin = new Scanner (System.in);
	private char Producto;
	private String color;
	private int can;
	
	public char TipoProducto() {
		System.out.println("BIENVENIDO");
		System.out.println("Articulos : A / B / C / D / E / F");
		System.out.print("Que articulo desea adquirir? ");
		Producto = jin.next().charAt(0);
		return Producto;
	}
	
	public String ColorProducto(char producto) {
		if(producto == 'A' || producto == 'a') {
			System.out.println("ROJO / VERDE / AMARILLO");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		else if(producto == 'B' || producto == 'b') {
			System.out.println("VERDE / NEGRO");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		else if(producto == 'C' || producto == 'c') {
			System.out.println("BLANCO");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		else if(producto == 'D' || producto == 'd') {
			System.out.println("ROJO / NEGRO");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		else if(producto == 'E' || producto == 'e') {
			System.out.println("VERDE");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		else if(producto == 'F' || producto == 'f') {
			System.out.println("ROJO / NEGRO");
			System.out.print("Que color desea: ");
			color = jin.next();
		}
		return color;
	}
	
	public int Cantidad() {
		System.out.print("Ingrese la cantidad que desea adquirir(unidad) :");
		can = jin.nextInt();
		return can;
	}
}
