
  import java.util.*;
public class ej17 {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int x;
		 int y;
		
		System.out.print("Introduzca su primer valor ");
		 x = sc.nextInt();
		 sc.nextLine();
		
		System.out.print("Introduzca su segundo valor ");
		 y = sc.nextInt();
		 sc.nextLine();
		 
		System.out.println("Suma = " + (x + y));
		System.out.println("Resta = " + (x - y));
		System.out.println("Producto = " + (x * y));
		System.out.println("Cociente = " + (x / y));
		
	}

}
