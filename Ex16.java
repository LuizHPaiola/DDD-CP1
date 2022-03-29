package exercicios_aula_24_03;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c;
		
		System.out.printf("Informe o primeiro lado do triângulo: ");
		a = ler.nextDouble();
		System.out.printf("Informe o segundo lado do triângulo: ");
		b = ler.nextDouble();
		System.out.printf("Informe o terceiro lado do triângulo: ");
		c = ler.nextDouble();
		
		if((a+b>c)&&(b+c>a)&&(c+a>b)){
			if(((a*a)==((b*b)+(c*c)))||((b*b)==((a*a)+(c*c)))||((c*c)==((b*b)+(a*a)))){
				System.out.printf("O triângulo é retângulo!");
			}else
				System.out.printf("O triângulo não é retângulo!");
			
			}else
			System.out.printf("Não é um triângulo!");
	ler.close();
	}
	

}
