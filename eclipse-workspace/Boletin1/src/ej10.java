
public class ej10 {

	public static void main(String[] args) {
		
		int niños = 20;
		int niñas = 20;
		int suma;
		int p_niños;
		int p_niñas;
		
		suma = (niños + niñas);
		p_niños = (niños*100)/suma;
		p_niñas = (niñas*100)/suma;
		
		 System.out.println("Tenemos matriculados " + niños + " niños y " + niñas + " niñas. En total, tenemos matriculados " + suma + " \nalumnos, siendo un " + p_niños + " perteneciente a los niños y " + p_niñas + " perteneciente a las niñas. " );
	}

}
