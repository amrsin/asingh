
public class ej12 {

	public static void main(String[] args) {
		
		int v_podemos = 20;
		int v_psoe = 30;
		int v_pp = 25;
		int v_ciudadanos = 30;
		int v_vox = 10;
		int suma_der;
		int suma_iz;
		int p_der;
		int p_iz;
		int suma_total;
		
		 suma_der = (v_podemos + v_psoe);
		 suma_iz = (v_pp + v_ciudadanos + v_vox);
		 suma_total = (suma_der + suma_iz);
		 p_der = (suma_der * 100/suma_total);
		 p_iz = (suma_iz* 100/suma_total);
		 
		  System.out.println("Los votos de la izquierda son " + suma_iz + " que constituyen el " + p_iz + "% del total\n y los votos de la derecha son " + suma_der + " que consituyen el " + p_der + "% del total");
		 
		 

	}

}
