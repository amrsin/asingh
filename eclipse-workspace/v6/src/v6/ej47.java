package v6;
import java.util.Scanner;
public class ej47 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		int resp_user;
		int n_intentos = 4;
		boolean correcto = false;
		
		
		//DATOS + DO PARA REPETIR EN DETERMINADO CASO
		do {
		System.out.println("------------------------------------------------");
		 System.out.print("Introduzca la conbinación: ");
	 	  resp_user = teclado.nextInt();
		
	 	
		if(resp_user == 1111) {
			correcto = true;
			
		}else { //SI EL USER INTRODUCE MALA CONBINACIÓN
			System.out.println("------------------------------------------------");
			 System.out.println("Lo siento, esa no es la combinación");
			n_intentos --;
		}
		}while (resp_user !=1111 && n_intentos > 0);
		
		//RESULTADO A IMPRIMIR
		if (correcto == true) {
			System.out.println("------------------------------------------------");
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		}else { //PIERDE TODAS LA OPORTUNIDADES
		 System.out.println("------------------------------------------------");
		  System.out.println("Ha perdido las 4 oportunidades. ");
		}
	}



}
