import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
public class ej_56 {
	 /*
	  * Nombre : Amritpal Singh
	  * Descripcion: Programas con menu de opciones
	  * Fecha: 30-10-2019
	  */

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		Date ahora = new Date();
		int user_resp=0;
		int dias_sumar;
		
		SimpleDateFormat formato;
	    
		
		System.out.println("1.- Obtener fecha actual\n"
				+ "2.- Obtener hora actual\n" + "3.- Sumar días\n"
				+ "4.- Diferencia en días\n" + "5.- Anterior o Posterior\n" 
				+ "9.- Salir");
		
		do {
			
		
		System.out.print("Introduzca la opción(1-5 -9para salir): ");
		user_resp = teclado.nextInt();
		teclado.nextLine();
		switch(user_resp) {
		case 1:
			
			formato = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println(formato.format(ahora));
			break;
			
		case 2: 
			
			formato = new SimpleDateFormat("hh:mm:ss");
			System.out.println(formato.format(ahora));
			break;
		case 3: 
			
			System.out.print("Dime los dias que quieres sumar: ");
			dias_sumar = teclado.nextInt();
			
			Calendar cal = new GregorianCalendar();
			cal.setTimeInMillis(ahora.getTime());
			cal.add(Calendar.DATE, dias_sumar);
			
			Date fechaSumar = new Date(cal.getTimeInMillis());
			
			formato = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Hoy + " + dias_sumar +" "+ formato.format(fechaSumar) + "(FechaSuma)");
			
		case 4: 
			String fecha_1; 
			String fecha_2;
			Date despues = new Date();
			long diferencia = 0;
			
			System.out.print("Dime la primera fecha");
			
			fecha_1 = teclado.nextLine();
			
			System.out.print("Dime la segunda fecha");
			
			fecha_2 = teclado.nextLine();
			
			formato = new SimpleDateFormat("dd-MM-yyyy");
			ahora = formato.parse(fecha_1);
			
			formato = new SimpleDateFormat("dd-MM-yyyy");
			despues = formato.parse(fecha_2);
			
			
			diferencia = ahora.getTime() - despues.getTime();
			System.out.print("Diferencia entre fecha_1 y fecha_2 es: " + 
			diferencia/(1000*60*60*24));
				
		case 5:
			
		
		case 9: 
			System.out.print("FIN");
			
		
		}
		}while (user_resp !=9);
		
		
		
		
	
		

	}

}
