import java.util.Scanner;
public class ej35 {
	
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			//Variables
			int altura;
			int anchura;
			String pregunta_escudo;
			double escudo = 0;
			int cm2;
			double p_bandera;
			double g_envio = 3.25;
			double total;
			String si_escudo = "Con escudo";
			String no_escudo = "Sin escudo";
			
			
			
			
			//DATOS REQUERIDOS 
			System.out.print("Introduzca la altura de la bandera en cm: ");
			 altura = teclado.nextInt();
			System.out.print("Introduzca la anchura de la bandera: ");
			 anchura = teclado.nextInt();
			System.out.print("¿Quiere escudo bordado? (s/n): ");
			 teclado.nextLine();
			 pregunta_escudo = teclado.nextLine();
			 
			  // CONDICIONES 
			  if (pregunta_escudo.equals("s")) {
				  
				  pregunta_escudo = si_escudo;
				  escudo = 2.50;
				  cm2 = (altura * anchura);
				  p_bandera = (cm2*0.01);
				  total = (p_bandera + escudo + g_envio);

				  
			  } else {
				  pregunta_escudo = no_escudo;
				  cm2 = (altura * anchura);
				  p_bandera = (cm2*0.01);
				  total = (p_bandera  + g_envio);
				
			  }
			  
			  System.out.println("----------------------------------------------");
			  System.out.println("Gracias . Aqui tiene el desglose de su compra. ");
				System.out.println("----------------------------------------------\n"
			 	 + "Bandera de " + cm2 + " cm2 :\t" + p_bandera +" €" +"\n" + pregunta_escudo + "\t\t" + escudo + " €"
			 	 + "\nGastos de envio:\t" + g_envio +" €" + "\ntotal:\t\t\t" + total +" €" );
				System.out.println("----------------------------------------------");
			  

		}

	}


