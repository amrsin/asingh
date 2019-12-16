import java.util.Scanner;

public class ej_149 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String numero;
		numero = teclado.next();
		int toro;
		int num = Integer.parseInt(numero);
		int max = 0;

		for (int i = 0; i < num; i++) {
			numero = teclado.next();
			toro = Integer.parseInt(numero);
			if (toro > max) {
				max = toro;

			}

		}
		System.out.println(max);

	}
}
