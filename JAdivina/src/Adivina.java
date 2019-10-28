import java.util.Random;
import java.util.Scanner;
public class Adivina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1; 
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroIntroducido;
		int contadorIntentos = 0;
		int extremoIzquierdo = 1;
		int extremoDerecho = 1000;
		do {
			
		    contadorIntentos++;
		    System.out.printf("Adivina el número [intentos %s] (entre %s y %s): ",
		    		contadorIntentos, extremoIzquierdo, extremoDerecho);
		
		       numeroIntroducido = teclado.nextInt();
		       
		       if (numeroIntroducido < numeroAleatorio) 
		    	   extremoIzquierdo = numeroIntroducido +1;
		    	  
		       if (numeroIntroducido > numeroAleatorio)
		    	   extremoDerecho = numeroIntroducido -1;
		       
		       } while (numeroIntroducido != numeroAleatorio);
		
		System.out.printf("Enhorabuena. Has acertado en %s intentos.%n", 
				contadorIntentos);
	    	  
	      }
		 

}
