/*
 * Nombre : Amritpal Singh

 * Fecha: 18/09/2019
 * Descripción: Juego piedra, papel, tijeras
 */
package ej_programación;
import java.util.Random;
import java.util.Scanner;
public class ej_39 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		  Random Aleatorio = new Random();
		//VARIABLES 
		
		int num_aleatorio = Aleatorio.nextInt(3) +1;
		String resp = null ;
		boolean imprimir = false;
		String result = null;
		

		
		// 1 = Piedra
		// 2 = Papel
		// 3 = Tijeras
			
	
	
		System.out.println("-------------------------------------------------");
		System.out.print("Introduzca su elemento (Piedra, Papel o Tijeras): ");
		resp = teclado.nextLine();
		
		if (!resp.equalsIgnoreCase("Piedra") && !resp.equalsIgnoreCase("Papel") && !resp.equalsIgnoreCase("Tijeras")) {
			System.out.println("-------------------------");
			System.out.print("El elemento no es valido");
			
			
		}
		
		
		//CONDICIONES
		
		if(resp.equalsIgnoreCase("Piedra") && num_aleatorio == 2 ) {
			imprimir = true;
			result = "Ha ganado el ordenador.";
		
		}
		
		else if(resp.equalsIgnoreCase("Piedra") && num_aleatorio == 3) {
			imprimir = true;
			result = "Felicidades, ha ganado.";
			
		}
		
		else if(resp.equalsIgnoreCase("Piedra") && num_aleatorio == 1) {
			imprimir = true;
			result = "Ha sido empate.";
		}
			
		
		else if(resp.equalsIgnoreCase("Papel") && num_aleatorio == 3) {
			imprimir = true;
			result = "Ha ganado el ordenador.";
			
		}
		
		else if(resp.equalsIgnoreCase("Papel") && num_aleatorio == 1) {
			imprimir = true;
			result =  "Felicidades, ha ganado.";
			
		}
		
		else if(resp.equalsIgnoreCase("Papel") && num_aleatorio == 2) {
			imprimir = true;
			result = "Ha sido empate.";
		}
		
		else if(resp.equalsIgnoreCase("Tijeas") && num_aleatorio == 1) {
			imprimir = true;
			result =  "Ha ganado el ordenador.";
			
		}
		
		else if(resp.equalsIgnoreCase("Tijeas") && num_aleatorio == 2) {
			imprimir = true;
			result =  "Felicidades, ha ganado.";
			
		}
		
		else if(resp.equalsIgnoreCase("Tijeas") && num_aleatorio == 3) {
			imprimir = true;
			result = "Ha sido empate.";
		}
		
		
		
		if(imprimir == true) {
			System.out.println("-------------------------");
			System.out.print(result);
		}
		
		
		
		
	}

}
