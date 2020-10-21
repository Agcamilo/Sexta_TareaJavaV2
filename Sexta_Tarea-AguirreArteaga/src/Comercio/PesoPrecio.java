package Comercio;

public class PesoPrecio {
	public int peso(String color, char producos) {
		if(producos == 'A' || producos == 'a') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 235;
			}
			if(color.equalsIgnoreCase("VERDE")) {
				return 342;
			}
			if(color.equalsIgnoreCase("AMARILLO")) {
				return 200;
			}
		}
		if(producos == 'B' || producos == 'b') {
			if(color.equalsIgnoreCase("VERDE")) {
				return 300;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 345;
			}
		}
		if(producos == 'C' || producos == 'c') {
			return 453;
		}
		if(producos == 'D' || producos == 'd') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 234;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 654;
			}
		}
		if(producos == 'E' || producos == 'e') {
			return 567;
		}
		if(producos == 'F' || producos == 'f') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 321;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 642;
			}
		}
		return 0;
	}
	
	public int precio(String color, char producos) {
		if(producos == 'A' || producos == 'a') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 200;
			}
			if(color.equalsIgnoreCase("VERDE")) {
				return 210;
			}
			if(color.equalsIgnoreCase("AMARILLO")) {
				return 220;
			}
		}
		if(producos == 'B' || producos == 'b') {
			if(color.equalsIgnoreCase("VERDE")) {
				return 300;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 220;
			}
		}
		if(producos == 'C' || producos == 'c') {
			return 340;
		}
		if(producos == 'D' || producos == 'd') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 450;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 470;
			}
		}
		if(producos == 'E' || producos == 'e') {
			return 600;
		}
		if(producos == 'F' || producos == 'f') {
			if(color.equalsIgnoreCase("ROJO")) {
				return 400;
			}
			if(color.equalsIgnoreCase("NEGRO")) {
				return 430;
			}
		}
		return 0;
	}

}
