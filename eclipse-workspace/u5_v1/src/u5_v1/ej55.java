package u5_v1;
import java.util.Scanner;


public class ej55 {
	
		public static void main(String[] args) {
			
			//var
			Scanner teclado = new Scanner(System.in);
			int DNI;
			int resto;
			
			//ARRAY
			char letra [ ] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B' , 
					'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E',};

			//Dato requerido por user 
			System.out.print("Digame su DNI y le dire la letra: ");
			DNI = teclado.nextInt();
			//operación
			resto = DNI%23;
			//reslt letra DNI
			System.out.println("-----------------------------------------------");
			System.out.println("Su letra del DNI es: " + letra[resto]);
			System.out.println("-----------------------------------------------");
			  
		}
}
