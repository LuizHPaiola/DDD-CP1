package Exercicos;
import java.util.Scanner;

public class Ex17aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
		
		System.out.printf("Informe seu peso: ");
			peso = ler.nextDouble();
		System.out.printf("Informe sua altura: ");
			altura = ler.nextDouble();
		System.out.printf("Você é homem ou mulher?");
			sexo = ler.next();
			
			
		
		imc = peso/(altura*altura);
		
		if(sexo.equals("homem")){
			if(imc>20){
				if(imc<24){
					System.out.printf("Você está no peso ideal!");
				}else{
					System.out.printf("Você está acima do peso!");
				}
			}else{
				System.out.printf("Você está abaixo do peso!");
			}
		}
			
		
		if(sexo.equals("mulher")){
			if(imc>19){
				if(imc<24){
					System.out.printf("Você está no peso ideal!");
					}else{
						System.out.printf("Você está acima do peso!");
					}
				}else{
					System.out.printf("Você está abaixo do peso!");
				}
			}	
				
		ler.close();
		}
	}


