package estrutura_decisao;
import java.util.Scanner;

public class Ex8aula {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite dois numeros: ");
		int num1, num2;
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		
		if(num1>num2){
			System.out.printf("O %.1s é maior!", num1);
			
		}else{
			System.out.printf("O %.1s é maior!", num2);
		}
		ler.close();
	}

}
