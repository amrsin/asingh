package vectornew;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

public class vector {

	public static void main(String[] args) {
              
		 
	}
      public static int max(int[] v) {
    	  if (v.length == 0) {
			throw new IllegalArgumentException();
		}
         int max= v[0];
         for (int i = 1; i < v.length; i++) {
			
        	 if (v[i] > max) {
				max = v[i];
			} 
		}
		return max;
	}   
      
      public static void ordenar(int[] v1) {
    	  
    	  
    	  for (int i = 0; i < v1.length - 1; i++) {
			for (int j = i + 1 ; j < v1.length; j++) {
				if (v1.length == 0) {
					 throw new IllegalArgumentException();
				}
				if (v1[i] > v1[j]) {
					int aux = v1[i];
					v1[i] = v1[j];
					v1[j] = aux;
				}
			}
		}
   }
}