package entrada_processamento_saida;
import java.util.Scanner;

public class Ex03aula {

	public static void main(String[] args) {
		int base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a base do tri�ngulo: ");
		base = ler.nextInt();
		System.out.printf("informe a altura do tri�ngulo: ");
		altura = ler.nextInt();
		area = (base*altura)/2;
		System.out.printf("A area do tri�ngulo � "+area);
		ler.close();
	}

}
