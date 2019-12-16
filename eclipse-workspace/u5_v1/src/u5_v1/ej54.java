package u5_v1;

import java.util.Scanner;
import java.util.Random;

public class ej54 {
	

		public static void main(String[] args) {
			//Var
			Scanner teclado = new Scanner(System.in);
			Random num_aleatorio = new Random();
			int user_array;
			int user_inferior;
			int user_superior;
		
			
			
			//Datos requeridos por user
			System.out.print("Introduzca tamaño del array: " );
			user_array = teclado.nextInt();
			int array [] = new int [user_array];
			
			teclado.nextLine();
			//Datos requeridos por user
			 System.out.print("Introduzca limites inferior y superior para generar números aleatorios: " );
			 user_inferior = teclado.nextInt();
			 user_superior = teclado.nextInt();
			
			

			      //BUCLE
	 	     	for (int i=0; i < array.length; i++) {
				array[i]=((int)(Math.random()*(user_inferior)+ user_superior));
				System.out.print("[" + array[i]+ "]"); //RESLT
				
					
			}
			
			
			
			
			
			
			
		
		}

}
