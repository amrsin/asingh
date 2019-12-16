import java.util.Scanner;
public class ej22 {
   /**
    * 
    * @amrit
    */
	public static void main(String[] args) {
	  Scanner teclado = new Scanner(System.in);
	    
	    //variables 
	    int num_estudiante;
	    String nombre; 
	    double nota_1;
	    double nota_2;
	    double nota_3;
	    double media;
	    
	    //datos
	    System.out.print("Introduzca número de estudiante: ");
	    num_estudiante = teclado.nextInt();
	    teclado.nextLine();
	    System.out.print("Introduzca nombre del alumno: ");
	    nombre = teclado.nextLine();
	    System.out.print("Introduzca nota1: ");
	    nota_1 = teclado.nextDouble();
	    System.out.print("Introduzca nota2: ");
	    nota_2 = teclado.nextDouble();
	    System.out.print("Introduzca nota3: ");
	    nota_3 = teclado.nextDouble();
	    
	    //OPERACIONES
	    
         media = ((nota_1 + nota_2 + nota_3)/3);
         
         //Resultado
         System.out.println("-----------------------------");
         System.out.print("Alumno: " + num_estudiante + "-" + nombre  + "\t\tex.1\t\tex.2\t\tex.3\t\tmedia");
         System.out.println("\nNotas 1era evaluacion " + "\t\t" + nota_1 + "\t\t" + nota_2 + "\t\t" + nota_3 + "\t\t" + media );
         System.out.println("-----------------------------");
	    

	}

}
