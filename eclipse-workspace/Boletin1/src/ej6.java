
public class ej6 {

	public static void main(String[] args) {
		int a  = 2;
		int b = 7;
		int c = 4;
		double x_positiva;
		double x_negativa;
		double raiz;
		
		
		 raiz = Math.sqrt((b*b)-4*a*c);
		
		if (raiz >=0) {
		 x_positiva = (-b + raiz)/2*a; 
		 x_negativa = (-b - raiz)/2*a;
		
		
		System.out.println("El valor de x siendo a =" + a + " " + " b=" + b  + "" +"b=" + "" + "y c " + c + "es igual a " + x_positiva + " " + x_negativa);
		}
		else { 
		  System.out.println("Esto no tiene solución.");
		
		}
		

	}

}
