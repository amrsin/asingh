package u5_v1;
import java.util.Scanner;
public class ej54_v2 {

		public static void main(String[] args) {
			//Var
			Scanner teclado = new Scanner(System.in);
			int user_array;
			String user_limit;
			int total=0;
			
			//Info. necesaria por user
			System.out.print("Introduzca tamaño del array: " );
			user_array = teclado.nextInt();
			int array [] = new int [user_array]; //Creamos el array
			
			 teclado.nextLine(); //asi podrá leer strings
			//Info. necesario por user
			 System.out.println(" ");
			 System.out.print("Introduzca limites inferior y superior para generar números aleatorios: " );
			 user_limit = teclado.nextLine();
			 
			 String user_inicio = user_limit.split(" ")[0]; //Indicamos donde esta el inicio del array
			 String user_fin = user_limit.split(" ")[1]; //Indicamos donde esta el fin del array
			 
	     	 int user_inicio2 = Integer.parseInt(user_inicio); //pasamos de string a int
			 int user_fin2 = Integer.parseInt(user_fin); //pasamos de string a int
			 
			 System.out.println("_____________________________________________________________________________");  
			    System.out.println("Se ha generado el siguiente array de " + user_array + " posiciones: ");
			    //bucle para imprimir los array
	 	     	for (int i=0; i < array.length; i++) {
	 	     	
				array[i]=((int)(Math.random()*(user_fin2)+ user_inicio2 )); //numeros aleatorios entre limites indicados por user
				System.out.print("[" + array[i] + "]"); //result a imprimir					
			}
	 	     	
	 	     	//bucle para la suma 
	 	     	System.out.println(" ");
	 	     	for (int suma = 0; suma < array.length; suma++) {
		
					total += array[suma]; //suma de los arrays
				}
	 	         
	 	     	System.out.println("La suma de los elementos es: " + total); //result
	 	     	System.out.println("_____________________________________________________________________________"); 
		}

	}

