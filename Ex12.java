package exercicios_aula_24_03;
import java.util.Scanner;

public class Ex12 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double base, altura, area;
		System.out.printf("informe a base do ret�ngulo: ");
		base=ler.nextDouble();
		
		System.out.printf("Informe a altura do ret�ngulo: ");
		altura=ler.nextDouble();
		
		area=base*altura;
		System.out.printf("A area do ret�ngulo equivale a %.2f m�. ",area);
		
		if(area>=100) {
			System.out.printf("O terreno � grande!");
		}else{
			System.out.printf("O terreno � pequeno");
		}
	ler.close();
	}
}
