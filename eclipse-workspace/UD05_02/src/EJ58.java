import java.util.Scanner;
public class EJ58 {

	public static void main(String[] args) {
		
		//var
		Scanner teclado = new Scanner(System.in);
		int user_filas;
		int user_columnas;
		int suma  = 0;
		
		
		//inf necesaria por user
		System.out.print("Introduzca el tamaño de filas: ");
		user_filas = teclado.nextInt();
		//inf necesaria por user
		System.out.print("Introduzca el tamaño de columnas: ");
		user_columnas = teclado.nextInt();
		
		//creacion de aaray
		int [][] Matriz = new int [user_filas] [user_columnas];
		 
		
		for (int i=0; i < user_filas; i++) {
			for (int j=0; j < user_columnas; j++){
				 
			System.out.print("Introduca dato para la posición " + "["+ i + "]" + "[" + j+ "]: ");
			 Matriz[i][j] = teclado.nextInt();
			 suma += Matriz[i][j];
			}
		}
		
				for (int i=0; i < user_filas; i++) {
					for (int j=0; j < user_columnas; j++){
						 
					System.out.printf("%4d", Matriz[i][j]);			  
		}
		 System.out.print("\n");
			
		}
		 System.out.print("La suma de todos los componentes es: " + suma);	 
	 }
	}