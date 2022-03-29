package exercicios_aula_24_03;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe sua altura: ");
		altura=ler.nextDouble();
		System.out.printf("Informe seu peso: ");
		peso=ler.nextDouble();
		
		imc = peso/(altura*altura);
		if(imc>19){
			if(imc<25){
				System.out.printf("Você está no peso ideal!");
				}else{
					System.out.print("Você não está no peso ideal!");
				}	
		}else{
			System.out.print("Você não está no peso ideal!");
		}
		ler.close();
	}
}
