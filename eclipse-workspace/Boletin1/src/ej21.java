import java.util.Scanner;
public class ej21 {
	/**
	 * 
	 * @author amrit
	 *
	 */
		public static void main(String[] args) {
		 
		  Scanner teclado = new Scanner(System.in);
		 
		  // Variables 
		  String nombre;
		  int NIF;
		  String dir;
		  int cantidad;
		  String concepto;
		  double precio;
		  double t_importe;
		  int descuento;
		  double p_descuento;
		  double total_b;
		  double importe;

		 
		  //datos necesarios
		  System.out.print("Su nombre ");
		  nombre = teclado.nextLine();
		  System.out.print("Su NIF " );
		  NIF = teclado.nextInt();
		  teclado.nextLine();
		  System.out.print("Su domicilio ");
		  dir = teclado.nextLine();
		  System.out.print("Su producto ");
		  concepto = teclado.nextLine();
		  System.out.print("Precio producto ");
		  precio = teclado.nextInt();
		  System.out.print("Cantidad producto ");
		  cantidad = teclado.nextInt();
		  System.out.print("Descuento ");
		  descuento = teclado.nextInt();
		  
		  //operaciones
		  importe = (precio * cantidad);
		  total_b = importe;
		  p_descuento = ((total_b*descuento)/100);
		  t_importe = (total_b - p_descuento);
		  
		  //factura
		  System.out.println("-----------------------------");
		  System.out.println("Cliente: " + nombre + "\t NIF: " + NIF + "\t" + "\nDomicilio " + dir + 
				            "\nCantidad " + cantidad  + "\tConcepto - REF  " + concepto 
				             +"\tprecio " + precio + "\tImporte " + importe);
		  System.out.println("Total bruto " + total_b + "\tDescuento " + descuento+"%"  + " \tTOTAL " + t_importe);
		  System.out.println("-----------------------------");
		  
		 

		  
		  

		  
		  
	      
		}

	}