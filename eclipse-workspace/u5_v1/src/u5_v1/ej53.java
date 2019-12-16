package u5_v1;
import java.util.Scanner;
import java.util.Random;

public class ej53 {

	
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			Random num_random = new Random();
			
			//VATIABLES
			int resp_num;
			int num_Aleatorio = num_random.nextInt(100 + 1);
			boolean imprimir = false;
			String Mayor_menor = null;
			int intentos = 0;
			
			
			
			System.out.println("El juego del número mágico");
			
			do {
			 System.out.println("__________________________");
			System.out.print("Indroduzca numero: " );
			
			 resp_num = teclado.nextInt(); 
			 
			 //COMPARACIONES 
			 if (num_Aleatorio > resp_num) {
					
					Mayor_menor = "mayor";
					imprimir = true;
					
				}
				
				else if (num_Aleatorio < resp_num) {
					
					Mayor_menor = "menor";
					imprimir = true;
				}
				
			 //RESULTADO
				if (imprimir == true) {
					System.out.println("__________________________");
					System.out.println("El numero mágico es " + Mayor_menor);
				}
			    intentos ++;
			}while (resp_num != num_Aleatorio);
			
			System.out.println("__________________________________________________");
			System.out.println("Enhorabuena! Has acerado el numero que era el " + num_Aleatorio + "!\n"
					
					+ "Lo has solucionado en " + intentos + " intentos." );
		}
}
