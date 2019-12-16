/*
 * Nombre : Amritpal Singh
 * Fecha : 22/10/2019
 * Descripcion: Programa que pinta X hecha de asteriscos.
 */
package practica2;
import java.util.Scanner;
public class ej44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		int altura;
	
		
		
		
		//DATO NECESARIO
		System.out.print("Por favor, introduzca la altura de la X: ");
		altura = teclado.nextInt();
	
		if (altura % 2 !=0 && altura>=3) {
			for (int j= 0; j <altura; j++) {
				 for (int i=0; i<altura ; i++) {
					 if (i==j || (j+i)==(altura-1)) { 
						 	System.out.print("*");
					 } else {
						 System.out.print(" ");
					 }
				 }
		         System.out.println();
		    	 	
	   }
			
		} else 
			System.out.print("ERROR, el numero no es valido ");
		
		
			
	}

}
