
import java.util.Scanner;
public class ej36 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		double n_primerexm;
		double n_segundoexm;
		double media;
		String resp;
		
		System.out.print("Nota del primer control: ");
		n_primerexm = teclado.nextDouble();
		
		System.out.print("Nota del segundo control: ");
		n_segundoexm = teclado.nextDouble();
		
		media = ((n_primerexm + n_segundoexm) / 2);
		
		if(media >=5) {
			System.out.println("----------------------------------------------");
			 System.out.println("Tu nota de Programación es " + media);
			System.out.println("----------------------------------------------");
		}
		
		else if(media <5){
			System.out.println("----------------------------------------------");
			 System.out.print("Cual ha sido el resultado de la recuperación? (apto/no apto) ");
			 teclado.nextLine();
			 resp = teclado.nextLine();
			System.out.println("----------------------------------------------");
			
			if(resp.equals("apto")) {
				 System.out.println("Tu nota programación es 5 ");
				System.out.println("----------------------------------------------");
			}else {
				 System.out.println("Tu nota de Programción es " + media);
			    System.out.println("----------------------------------------------");
					
			
			}
		}
	}
	
}

