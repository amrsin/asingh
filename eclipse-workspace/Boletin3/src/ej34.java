
import java.util.Scanner;
public class ej34 {

	public static void main(String[] args) {
		
		//Creamos Scanner llamdo teclado
		Scanner teclado = new Scanner(System.in); 
		
		//variables
		int resp;
		int clientes = 0;
		int estado;
		String viaje;
		double t_viaje = 0;
		double sueldo_b = 0;
		double sueldo_bruto = 0;
		double sueldo_neto = 0;
		double IRPF = 0;
		double IRPF_CALC = 0;
		boolean imprimir = false;
		
		//Información necesaria para el usuario
		System.out.println("*************************************");
		 System.out.println(" 1. Programador junior\n 2. Prog.senior\n 3. Jefe de proyecto "  );
		System.out.println("*************************************");
		
		//Preguntas al usuario
		System.out.print("Introduzca el cargo de trabajo: ");
		 resp = teclado.nextInt();
		 
		System.out.print("Ha estado de viaje?(si o no): ");
		teclado.nextLine();
		 viaje = teclado.nextLine();
		  if(viaje.equals("si")) {
			System.out.print("¿Cuantos días ha estado de viaje visitando clientes?: ");
			 clientes = teclado.nextInt();
			 
		  }
			 		 
		System.out.print("Introduzaca su estado civil(1 - Soltero, 2 - Casado): ");
		 estado = teclado.nextInt();
	

		//Operaciones / condiciones
		  if (resp == 1 && estado == 1) {
			 sueldo_b = 950;
			 IRPF = 25;
			 t_viaje = (clientes * 30 );
			 sueldo_bruto = (sueldo_b + t_viaje);
			 IRPF_CALC = (sueldo_bruto * IRPF/100 );
			 sueldo_neto = (sueldo_bruto - IRPF_CALC);
			 imprimir = true;
			 
		  }
			
		
		  else if (resp == 1 && estado == 2 ) {
			 sueldo_b = 950;
			 IRPF = 20;
			 t_viaje = (clientes * 30);
			 sueldo_bruto = (sueldo_b + t_viaje);
			 IRPF_CALC = (sueldo_bruto * IRPF/100 );
			 sueldo_neto = (sueldo_bruto - IRPF_CALC);
			  imprimir = true;
			 
		 }
		  
		
		 if (resp == 2 && estado == 1) {
			sueldo_b = 1200;
			IRPF = 25;
			t_viaje = (clientes * 30);
		    sueldo_bruto = (sueldo_b + t_viaje);
		    IRPF_CALC = (sueldo_bruto * IRPF/100 );
			sueldo_neto = (sueldo_bruto - IRPF_CALC);
			 imprimir = true;
			 		 
		 }
			 
		 else if (resp == 2 && estado == 2 ) {
			sueldo_b = 1200;
			IRPF = 20;
			t_viaje = (clientes * 30);
			sueldo_bruto = (sueldo_b + t_viaje);
			IRPF_CALC = (sueldo_bruto * IRPF/100 );
			sueldo_neto = (sueldo_bruto - IRPF_CALC);
			 imprimir = true;
		 }
		
		 if (resp == 3 && estado == 1) {
			sueldo_b = 1600;
			IRPF = 25;
			t_viaje = (clientes * 30);
			sueldo_bruto = (sueldo_b + t_viaje);
			IRPF_CALC = (sueldo_bruto * IRPF/100 );
			sueldo_neto = (sueldo_bruto - IRPF_CALC);		
		     imprimir = true;
								 
		  }
					 
		 else if (resp == 3 && estado == 2 ) {
			sueldo_b = 1600;
			IRPF = 20;
			t_viaje = (clientes  * 30);
			sueldo_bruto = (sueldo_b + t_viaje);
			IRPF_CALC = (sueldo_bruto * IRPF/100 );
			sueldo_neto = (sueldo_bruto - IRPF_CALC);
			 imprimir = true;
			
			 	 	
		 }
		 if (imprimir == true) {
			//RESULTADO A IMPRIMIR
			 System.out.println();
			 System.out.println("***************************");
			 System.out.println("Sueldo base " + sueldo_b + " €");
			 System.out.println("Dietas " + "(" + clientes + ") "+ t_viaje + " €");
			 System.out.println("***************************");
			 System.out.println("Sueldo bruto " + sueldo_bruto + " €");
			 System.out.println("Retención " +"(" + IRPF + "%) " + IRPF_CALC + " €");
			 System.out.println("***************************");
			 System.out.println("Sueldo neto " + sueldo_neto + " €");
			 System.out.println("***************************");
		 }
		
	}	
	
}
	   
		 
	

