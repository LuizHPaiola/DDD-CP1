package Exercicos;
import java.util.Scanner;

public class Ex18aula {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, v0, t, v;
		
		System.out.printf("Informe a acelereção: ");
			a=ler.nextDouble();
		System.out.printf("Informe a velocidade inicial: ");
			v0=ler.nextDouble();
		System.out.printf("Informe o tempo do percurso: ");
			t=ler.nextDouble();
		
			v=v0+a*t;
		System.out.printf("%.0f km/h \n",v );

		if(v<=40) {
			System.out.printf("Veículo muito lento");
		}else if(v<=60){
			System.out.printf("Velocidade permitida");
		}else if(v<=80) {
			System.out.printf("Velodade de cruzeiro");
		}else if(v<=120) {
			System.out.printf("Veículo rápido");
		}else {
			System.out.printf("Veículo muito rápido");
		}
		ler.close();
	}

}
