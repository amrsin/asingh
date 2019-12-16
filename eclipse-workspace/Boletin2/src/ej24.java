import java.util.Scanner;
public class ej24 {

	
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			//Variables
			int a;
			int b;
			int c;
			float x_positiva;
			float x_negativa;
			double raiz;
			
			
			//datos
			
			System.out.print("Digame el valor a: ");
			a = teclado.nextInt();
			System.out.print("Digame el valor b: ");
			b = teclado.nextInt();
			System.out.print("Digame el valor c: ");
			c = teclado.nextInt();
			
			
			
			
			//operaciones
			
			 raiz = Math.sqrt((b*b)-4*a*c);
			
			if (raiz >=0) {
			 x_positiva = (float)(-b + raiz)/2*a; 
			 x_negativa = (float)(-b - raiz)/2*a;
			
			//resultado
			System.out.println("----------------------------------"); 
			System.out.println("El valor de x siendo a =" + a + " " + " b= " + b  + "" +"b= " + "" + " y c " + c +
					" es igual a " + x_positiva + " " + x_negativa);
			}
			else { 
			  System.out.println("Esto no tiene solución.");
			System.out.println("----------------------------------");
			}
			

	}

}
