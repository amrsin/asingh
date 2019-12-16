package u5_v1;

public class ej52 {

	public static void main(String[] args) {
		
		int numeros[] = new int [100];
		
		int suma=0;
		double media = 0;
		
		 for (int i = 0; i < numeros.length; i++) {
			 
			 numeros[i] = i + 1;
             suma = suma+numeros[i];
             media =(float) suma / numeros.length;
             
			 System.out.printf("%4d" , numeros[i]);
			 
					  
		 }
		 
		
		 System.out.println("");
		 System.out.println("");
		 System.out.println("La suma de los numeros es: " + suma);
		 System.out.println("La media de los numeros es: " + media);
		

	}

}
