
public class ej11 {

	public static void main(String[] args) {
		
		double altura = 165;
		double peso = 70000;
		double m_corporal;
		double al_metro;
		double p_kg;
		
		al_metro = (altura/100);
		p_kg = (peso/1000);
		m_corporal = (peso/(al_metro*al_metro));
		
		 System.out.println("El IMC calculado es " + m_corporal);
	}

}
