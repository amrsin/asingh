import java.util.*;
public class ej18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double MB;
		System.out.print("Introduzca su valor MB ");
		 MB = sc.nextInt();
		
		System.out.println("MB " + MB);
		System.out.println("BYTES " + (MB * 1048576 ));
		System.out.println("KB " + (MB * 1024));
		System.out.println("GB " + (MB / 1024));
		System.out.println("TB " + (MB / 1000000));

			}

}
