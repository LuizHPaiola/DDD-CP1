package entrada_processamento_saida;
import java.util.Scanner;

public class Ex07aula {

	public static void main(String[] args) {
		float p1, p2, p3, p4, p5, pagamento, troco, compra;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor dos produtos:");
		p1 = ler.nextFloat();
		p2 = ler.nextFloat();
		p3 = ler.nextFloat();
		p4 = ler.nextFloat();
		p5 = ler.nextFloat();
		compra = p1+p2+p3+p4+p5;
		System.out.printf("Ficou %.2f reais!\n", compra);
		System.out.println("Digite o valor recebido:");
		pagamento = ler.nextFloat();
		
		if(compra>pagamento) {
			System.out.printf("Dinheiro insuficiente!");
			
		}else{
			troco = pagamento-compra;
			System.out.printf("O seu troco é: "+troco);
		}
		ler.close();
	}

}
