package exercicios_aula_24_03;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c;
		
		System.out.printf("Informe o primeiro lado do tri�ngulo: ");
		a = ler.nextDouble();
		System.out.printf("Informe o segundo lado do tri�ngulo: ");
		b = ler.nextDouble();
		System.out.printf("Informe o terceiro lado do tri�ngulo: ");
		c = ler.nextDouble();
		
		if((a+b>c)&&(b+c>a)&&(c+a>b)){
			if(((a*a)==((b*b)+(c*c)))||((b*b)==((a*a)+(c*c)))||((c*c)==((b*b)+(a*a)))){
				System.out.printf("O tri�ngulo � ret�ngulo!");
			}else
				System.out.printf("O tri�ngulo n�o � ret�ngulo!");
			
			}else
			System.out.printf("N�o � um tri�ngulo!");
	ler.close();
	}
	

}
