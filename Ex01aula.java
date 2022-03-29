package entrada_processamento_saida;
import java.util.Scanner;

public class Ex01aula {

	public static void main(String[] args) {
		int base, altura, area;
		Scanner ler = new Scanner(System.in);
	System.out.printf("Digite a base do retângulo: ");
		base = ler.nextInt();
	System.out.printf("Digite a altura do retângulo: ");
		altura = ler.nextInt();
	area = base*altura;
	System.out.printf("A area do retângulo é: "+area);
	ler.close();
	}

}
