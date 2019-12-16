package v3;
import java.util.Scanner;

public class ej28 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES 
		
		double valor_radio; 
		double long_circunf;
		double area_circunf;
		double volumen_esfera;
		double pi = 3.1416;
	
		//BIENVENIDA
		System.out.println(" Bienvenido al programa donde todo sale redondo!");
		System.out.println("------------------------------------------------");
		
		//DATOS REQUERIDOS
		System.out.print("Introduzca el valor del radio: ");
		valor_radio = teclado.nextDouble();
		
		//OPERACIONES
		
		long_circunf = (2*pi*valor_radio);
		area_circunf = (pi * (valor_radio * valor_radio));
		volumen_esfera = (4/3.0f*pi*(valor_radio*valor_radio*valor_radio));
		
		//RESULTADO
		System.out.println("La longitud de la circunferencia es: " + long_circunf  );
		System.out.println("El area de la circunferencia es: " + area_circunf);
		System.out.println("Si fuera una esfera, su volumen seria: " + volumen_esfera);
	}

}
