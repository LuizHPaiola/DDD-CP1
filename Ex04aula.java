package entrada_processamento_saida;
import java.util.Scanner;

public class Ex04aula {

	public static void main(String[] args) {
		float num1, num2, num3, num4, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite quatro n�meros");
		num1 = ler.nextFloat();
		num2 = ler.nextFloat();
		num3 = ler.nextFloat();
		num4 = ler.nextFloat();
		media = (num1+num2+num3+num4)/4;
		System.out.printf("A m�dia dos n�meros digitados �: "+media);
		ler.close();
	}

}
