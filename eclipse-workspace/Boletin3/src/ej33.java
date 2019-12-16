import java.util.Scanner;
public class ej33 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		String resp;
		int contador = 0;
		String resp_si = "si";
		String resp_no = "no";
		
		
		
		//Preguntas
		System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
		 resp = teclado.nextLine();
		  if (resp.equals(resp_si)) {
			contador = contador + 3;
		 }
	
		System.out.print("2. Ha aumentado sus gastos de vestuario. ");
		 resp = teclado.nextLine();
		  if (resp.equals(resp_si) ) {
			contador = contador + 3;
			
		 }
		 
		System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti. ");
		 resp = teclado.nextLine();
		  if (resp.equals(resp_si)) {
			 contador = contador + 3;
			}
		 
		System.out.print("4. Ahora se asea con más frecuencia. ");
		 resp = teclado.nextLine();
		   if (resp.equals(resp_si)) {
			contador = contador + 3;
		}
		
		System.out.print("5. No te deja que mires la agenda de su teléfono móvil. ");
		 resp = teclado.nextLine();
		   if (resp.equals(resp_si)) {
			contador = contador + 3;
		}
		
		System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. ");
	 	 resp = teclado.nextLine();
		  if (resp.equals(resp_si)) {
		   contador = contador + 3;
			
		}
		
	 	 System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. ");
	 	  resp = teclado.nextLine();
		   if (resp.equals(resp_si)) {
			contador = contador + 3;
			}
		   
		 System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. ");
		  resp = teclado.nextLine();
		    if (resp.equals(resp_si)) {
			 contador = contador + 3;
			}
			
		 System.out.print("9. Has notado que últimamente se perfuma más. ");
		  resp = teclado.nextLine();
			if (resp.equals(resp_si)) {
			 contador = contador + 3;
			}
			
		 System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo. ");
		 resp = teclado.nextLine();
		    if (resp.equals(resp_si)) {
			 contador = contador + 3;
			}
		    
		  
		   
		 //resultado a imprimir 
		    System.out.println("---------------------------------------------------------");
		    if (contador <=10 && contador >=0) {
		    	System.out.print(" !Enhorabuena! tu pareja parece ser totalmente fiel.");
		    	
		    }
		    
		    else if (contador >10 && contador <=23) {
		     System.out.print(" Quizás exista el peligro de otra persona en su vida o en su mente,"
		     		+ " aunque seguramente seŕa algo sin importancia. No bajes la guardia. ");
		    
		     
		    }
		    
		    else if (contador >23 && contador <=30) {
		     System.out.print(" Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona."
		     		+ " Te aconsejamos que indagues un poco más y avarigües que es lo que está pasando por su cabeza");
		    }
		    
		    
		    
		    
		    
		    
	}

}
