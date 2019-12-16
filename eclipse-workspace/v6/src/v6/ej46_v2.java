package v6;
	import java.util.Scanner;

	public class ej46_v2 {

		public static void main(String[] args) {
			
			 Scanner teclado = new Scanner(System.in);
			 
			 int dia_semana;
			 double hora_minutos;
			 double queda_dia = 0;
			 int Lunes = 1;
			 int Martes = 2;
			 int Miercoles = 3;
			 int Jueves = 4;
			 int Viernes = 5;
			 int suma = 14;
			 
			 
			 System.out.print("En que dia está(1-5): ");
			 dia_semana = teclado.nextInt();
			 System.out.print("Dime la hora y los minutos: ");
			 hora_minutos = teclado.nextDouble();
			 
			 
		 	 for (int i = dia_semana + 1; i<=5; i++) {
			 queda_dia = (24 - hora_minutos); 
			 suma = suma + 24;
		 	 }
		 	 if (dia_semana ==4) {
		 		 System.out.println(queda_dia + 14);
		 	 }
		 	 else if (dia_semana < 4) {
				 System.out.println(suma + queda_dia);
			 	
				 
			 }
		 	 else if (dia_semana ==5) {
				 queda_dia = (14 - hora_minutos);
				System.out.println(queda_dia);
			 }
		 	 
		 	 }
		

	}


