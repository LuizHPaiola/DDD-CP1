package exercicios_aula_24_03;
import java.util.Scanner;

public class Ex15 {

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
			//equilatero
			if((a==b)&&(a==c)&&(c==b))
				System.out.printf("O tri�ngulo � equilatero!");
			//escaleno
			if((a!=b)&&(a!=c)&&(b!=c))
				System.out.printf("O tri�ngulo � escaleno!");
			//isoceles
			if(((a==b)&&(a!=c))||((b==c)&&(b!=a))||((a==c)&&(a!=b)))
				System.out.printf("O tri�ngulo � is�celes");
	}else
		System.out.printf("N�o � um triangulo");
	ler.close();
  }

}
