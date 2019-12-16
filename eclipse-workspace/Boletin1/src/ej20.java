import java.util.*;

/**
 * 
 * @author amrit
 *
 */

public class ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaramos la variables
		 double b;
		 double a;
		 double area;
		System.out.print("Introduzca la base del tríangulo ");
		 b = sc.nextInt();
		System.out.print("Introduzca la altura del tríangulo ");
		 a = sc.nextInt(); 
		
		area = (b*a/2);
		System.out.println("El triángulo de base " + b + " y altura " + a + " tiene un área de " + area);
		
		
	}  

}
