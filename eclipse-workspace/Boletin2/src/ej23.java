
import java.util.Scanner;
public class ej23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		
		String f_nacimiento;
		String NIF;
		String nombre;
		String dir;
		double s_bruto;
		int Retencion;
		double t_retencion;
		float s_neto;
		
		//datos
		
		System.out.print("Introduzca su fehcha de nacimiento en formato AAAA MM DD: ");
		f_nacimiento = teclado.nextLine();
		System.out.print("Introduzca NIF; ");
		NIF = teclado.nextLine();
		System.out.print("Introduzca nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduzca dirección: ");
		dir = teclado.nextLine();
		System.out.print("Introduzca salario: ");
		s_bruto = teclado.nextDouble();
		System.out.print("Introduzca retención: ");
		Retencion = teclado.nextInt();
		
		
		//OPERACIONES
		
		t_retencion = ((s_bruto*Retencion)/100);
		s_neto = (float)(s_bruto - t_retencion);
		//Resultado
		
		System.out.println("INFORME DEL TRABAJADOR");
		System.out.println("----------------------------------");
		System.out.println("Nombre.................: " + nombre);
		System.out.println("Dirección..............: " + dir);
		System.out.println("");
		System.out.println("NIF....................: " + NIF);
		System.out.println("Fecha de nacimiento....: " + f_nacimiento);
		System.out.println("");
		System.out.println("Salario base...........: " + s_bruto);
		System.out.println("Retencion..............: " + Retencion);
		System.out.println("Salario neto...........: " + s_neto);
		System.out.println("----------------------------------");
		
		
		
		
		
		
		
	}

}
