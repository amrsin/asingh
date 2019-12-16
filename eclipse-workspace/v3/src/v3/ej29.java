
package v3;
import java.util.Scanner;
public class ej29 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		String frase;
		
		
		System.out.print("Introduzca una frase para pasarla a mayúscala: ");
		frase = teclado.nextLine();
		System.out.println("--------------------------------------------------");
		System.out.println("Tu frase en minúscula es: " + frase);
		System.out.println("--------------------------------------------------");
		System.out.println("y en MAYÚSCULA es " + frase.toUpperCase());
		System.out.println("--------------------------------------------------");
		
	}

}
