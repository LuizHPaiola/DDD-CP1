package entrada_processamento_saida;
import java.util.Scanner;

public class Ex05aula {

	public static void main(String[] args) {
		double c, f;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor em °C:");
		c = ler.nextFloat();
		f = (c*9/5)+32;
		System.out.printf("Estão %.1f °F!", f);
		ler.close();
	}

}
