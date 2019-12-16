
import java.util.Scanner;
public class ej_217 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		do {
		num = teclado.nextInt();
		
		if(num!=0) {
			
			if (num % 2 !=0) {
				System.out.println("IZQUIERDA");
			}else  
				System.out.println("DERECHA");
		
		
		
		}
		}while (num !=0);
	 
		
		

	}

}
