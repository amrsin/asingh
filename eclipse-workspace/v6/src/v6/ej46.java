package v6;
  import java.util.Scanner;
public class ej46 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES 
		
		String dia_semana;
		double hora_minutos;
		double rest_horas_dia = 0;
		double falta_finde = 0;
		
		
			
		
		
	   System.out.print("En que dia de semana está?: ");
	   dia_semana = teclado.nextLine();
	   
	   System.out.print("Introduzca la hora ");
	   hora_minutos = teclado.nextDouble();
	   
	   
	   if (dia_semana.equalsIgnoreCase("Lunes")) {
		   
		   rest_horas_dia = (24 - hora_minutos);
	       //24 horas de martes/miercoles/jueves 14H de viernes
	   	   falta_finde = (86 +rest_horas_dia);
		  
	   }
	   
	   if (dia_semana.equalsIgnoreCase("Martes")) {
		   
		   rest_horas_dia = (24 - hora_minutos);
	       //24 horas de miercoles/jueves 14H de viernes
	   	   falta_finde = (62 +rest_horas_dia);
		  
	   }
	   
	   else if (dia_semana.equalsIgnoreCase("Miercoles")) {
		   
		   rest_horas_dia = (24 - hora_minutos);
	       //24 horas de jueves 14H de viernes
	   	   falta_finde = (38 +rest_horas_dia);
		  
	   }
	   
	   else if (dia_semana.equalsIgnoreCase("Jueves")) {
		   
		   rest_horas_dia = (24 - hora_minutos);
	       //14H de viernes
	   	   falta_finde = ( 14 +rest_horas_dia);
		  
	   }
	   
	   else if (dia_semana.equalsIgnoreCase("Viernes") && (hora_minutos >=14)) {
		   
		  System.out.print("Ya estas en fin de semana ");
	      
		  
	   }
	   
	  
	   
	   
	   System.out.print("Faltan " + falta_finde + " horas" );
	}

}
