package Comercio;

public class Transporte {
	
	private float peso;
	
	public int tarifaTransporte(int gramos){
		peso = gramos ;
		if(peso>0 && peso<10001) {
			return 200;
		}
		else if(peso>10000 && peso<20001) {
			return 300;
		}
		else if(peso>20000 && peso<30001) {
			return 450;
		}
		else if(peso>30000 && peso<100001) {
			return 900;
		}
		
		return 0;
	}
	
	

}
