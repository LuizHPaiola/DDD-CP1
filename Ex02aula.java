package entrada_processamento_saida;
import java.util.Scanner;

public class Ex02aula {

	public static void main(String[] args) {
		int aresta, area;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Qual o valor da aresta do quadrado? ");
		aresta = ler.nextInt();
		area = aresta*aresta;
		System.out.printf("A area do quadrado é: "+area);
		ler.close();
	}

}
