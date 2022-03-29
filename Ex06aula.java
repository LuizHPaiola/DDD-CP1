package entrada_processamento_saida;
import java.util.Scanner;

public class Ex06aula {

	public static void main(String[] args) {
		double real, dolar;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Valor em R$:");
		real = ler.nextFloat();
		dolar = real/4.94;
		System.out.printf("São %.2f dolares!", dolar);
		ler.close();

	}

}
