import java.util.Scanner;
public class ej_57 {

	public static void main(String[] args) {
		 /*
		  * Nombre : Amritpal Singh
		  * Descripcion: Programas con menu de opciones
		  * Fecha: 30-10-2019
		  */
		Scanner teclado = new Scanner(System.in);
		
		int user_resp;
		
		
		
		
		System.out.println("1.- Longitud de una cadena\n"
				+ "2.- Conparación\n" + "3.- Concatenación de dos cadenas\n"
				+ "4.- Obtener subcadenas\n" + "5.- Invertir cadenas\n" + "6- Es palíndromo" 
				+ "9.- Salisr");
		
		System.out.print("Introduzca la opción(1-5 -9para salir): ");
		user_resp = teclado.nextInt();
		
		
		switch(user_resp) {
		case 1:
			
			String l_cadena;
			System.out.print("Digame la cadena para saber su longitud: ");
			teclado.nextLine();
			l_cadena = teclado.nextLine();
			
			System.out.println(l_cadena.length());
			
			break; 
			
			
		case 2: 
			
			String p_palabra;
			String s_palabra;
			
			
			System.out.println("Digame la primera cadena");
			teclado.nextLine();
			p_palabra = teclado.next();
					
			System.out.println("Digame la segunda cadena");
			teclado.nextLine();
			s_palabra = teclado.next();
			
			
			int result = p_palabra.compareTo(s_palabra);
			
			 if(result == 0){
			     System.out.println("La primer cadena es igual que la segunda"); 
			    }else if(result < 0){
			      System.out.println("La primer cadena es mayor que la segunda");
			    }else{
			      
			      System.out.println("La primer cadena es menor que la segunda");
			    }
			 
			
			break;
		case 3: 
		
			String p_palabra1;
			String s_palabra2;
			
			
			System.out.println("Digame la primera cadena");
			teclado.nextLine();
			p_palabra1 = teclado.next();
					
			System.out.println("Digame la segunda cadena");
			teclado.nextLine();
			s_palabra2 = teclado.next();
			
			String junta = p_palabra1 + s_palabra2;
			
			System.out.print(junta);
			
			break;
	
			
		case 4: 
			
			String cadena;
			int numero_1;
			int numero_2;
			
			
			System.out.print("Introduce una cadena: ");
			cadena = teclado.nextLine();
			
			System.out.print("Dime el primer numero: ");
			numero_1 = teclado.nextInt();
			

			System.out.print("Dime el primer numero: ");
			numero_2 = teclado.nextInt();
			
			
			System.out.print(cadena.charAt(numero_1));
			System.out.print(cadena.charAt(numero_2));
			
			break;
			
			
		case 5:
		
			String palabra="";
			String palabraInvertida ="";
			int i;
			
			System.out.print("Introduce la palabra: ");
			teclado.nextLine();
			cadena = teclado.nextLine();
			
			for (i = palabra.length()-1; i>=0; i--) {
				
				palabraInvertida = palabraInvertida + palabra.charAt(i);
				
				System.out.print(palabraInvertida);
				
				
				
			}
			
			
			
			
			
		}
		

	}

}
