package entrada_processamento_saida;
import java.util.Scanner;

public class Ex03aula {

	public static void main(String[] args) {
		int base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a base do triângulo: ");
		base = ler.nextInt();
		System.out.printf("informe a altura do triângulo: ");
		altura = ler.nextInt();
		area = (base*altura)/2;
		System.out.printf("A area do triângulo é "+area);
		ler.close();
	}

}
