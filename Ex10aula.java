package estrutura_decisao;
import java.util.Scanner;

public class Ex10aula {

	public static void main(String[] args) {
		System.out.printf("Escreva dois numeros: ");
	int num1, num2;
		Scanner ler = new Scanner(System.in);
	num1 = ler.nextInt();
	num2 = ler.nextInt();
	
	if(num1>num2) {
		System.out.printf("O %.1s é maior!", num1);
	}else if(num1<num2) {
		System.out.printf("O %.1s é maior", num2);
		}else {
			System.out.printf("Os numeros são identicos!");
		}
	ler.close();
	}

}
