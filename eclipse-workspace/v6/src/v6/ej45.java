package v6;
import java.util.Scanner;
public class ej45 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//VARUABLES
		int precio_matricula = 0;
		char tipo_carnet;
		int numero_practica;
		int precio_practica = 0;
		int total_practica_r;
		int total_tarifa;
		boolean imprimir = false;
		
		//DATOS NECESARIOS 
		System.out.print("Introduzca curso (a,b,c,d) ");
		tipo_carnet  = teclado.next().charAt(0);
		
		System.out.print("Cuantas practicas ha realizado: ");
		numero_practica = teclado.nextInt();
		
		//Condiciones 
		
		if(tipo_carnet == 'a' || tipo_carnet == 'A') {
			
			precio_matricula = 150;
			precio_practica = 15;
			imprimir = true;
			
		}
		
		else if(tipo_carnet == 'b' || tipo_carnet == 'B') {
			
			precio_matricula = 325;
			precio_practica = 21;
			imprimir = true;
		}
		
		else if(tipo_carnet == 'c' || tipo_carnet == 'C') {
			
			precio_matricula = 520;
			precio_practica = 36;
			imprimir = true;
		}
		
		else if(tipo_carnet == 'd' || tipo_carnet == 'D') {
			
			precio_matricula = 610;
			precio_practica = 50;
			imprimir = true;
		}
		
		
		//operaciones 
		
		total_practica_r = (numero_practica * precio_practica);
		total_tarifa = (precio_matricula + total_practica_r );
		
		
		//RESULTADO A IMPRIMIR
		if (imprimir == true) {
		System.out.println("----------------------------------------");
		System.out.println("Curso " + tipo_carnet + "\nPracticas realizadas: " + numero_practica + " \nPrecio total de las practicas " + total_practica_r
				+ "\nTotal a pagar " + total_tarifa);

		}
	}

}
