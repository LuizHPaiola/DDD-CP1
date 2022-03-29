package estrutura_decisao;
import java.util.Scanner;

public class Ex09aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		System.out.printf("Escreva dois numeros:");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		
		if(num1<num2) {
			System.out.printf("O %.1s é menor!", num1);
		}else {
			System.out.printf("O %.1s é menor!", num2);
		}
		ler.close();
	}

}
