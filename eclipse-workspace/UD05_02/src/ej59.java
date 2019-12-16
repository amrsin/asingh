import java.util.Random;
public class ej59 {

	public static void main(String[] args) {
		
		//var
		Random num_random = new Random();	
		int num_Aleatorio1;
		int num_Aleatorio2;
		int tiradas=1;
		
		System.out.println("Vamos a tirar los datos...");
		do{
			num_Aleatorio1 = num_random.nextInt(6) + 1;
			num_Aleatorio2 = num_random.nextInt(6) + 1;
		System.out.println("En la tirada " + tiradas + " ha salido " + num_Aleatorio1
				+ " y el " + num_Aleatorio2);
		tiradas++;
		}while (num_Aleatorio1 != num_Aleatorio2);
		
		System.out.println("Al fin han salido iguales!");
		
		
		  
	}

	
}
