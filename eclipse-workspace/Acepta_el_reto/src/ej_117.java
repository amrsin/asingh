import java.util.Scanner;
public class ej_117 {
 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		String nombre;
		

		num = teclado.nextInt();
		
	
		
		
		for(int i=0; i<num; i++) {
		teclado.nextLine();
		nombre = teclado.nextLine();
		
		String[] partes=nombre.split(" ");
		
		 System.out.println("Hola, " + partes[1]+".");
		}
		
		
		
	
		
		}	 
		
	

	}


