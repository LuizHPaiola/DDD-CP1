package exercicios_aula_24_03;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		double num1, num2, num3;
		System.out.printf("Insira o primeiro numero: ");
		num1=ler.nextDouble();
		System.out.printf("Insira o segundo numero: ");
		num2=ler.nextDouble();
		System.out.printf("Insira o terceiro numero: ");
		num3=ler.nextDouble();
	
		
		if(num1>num2){
			if(num1>num3){
				System.out.printf("O primeiro número é o maior!",num1);
			
				}else{
				System.out.printf("O terceiro número é o maior!",num3);
					}	
				
			}else if(num2>num3){
				System.out.printf("O segundo número é o maior!",num2);
			}else {
				System.out.printf("O terceiro número é o maior!",num3);
			}
	ler.close();
	}
}


