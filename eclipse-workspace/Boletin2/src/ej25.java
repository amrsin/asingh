import java.util.Scanner;
public class ej25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//variables
		int a;
		int b;
		int hipotenusa;
		
		
		//datos
		System.out.print("Introduzca el valor a ");
		 a = teclado.nextInt();
		System.out.print("Introduzca el valor b ");
		 b = teclado.nextInt();
		
		//operaciones
		hipotenusa = (int)Math.sqrt(a*a + b*b);
		
		//resultado
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("Triángulo con cateto " + "a = " + a + " b = " + b + " su hipotenusa es " + hipotenusa);
		
		
		
		
		
		

	}

}