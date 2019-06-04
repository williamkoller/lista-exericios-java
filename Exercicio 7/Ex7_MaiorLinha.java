package Ex_03_06;
import java.util.Scanner;
public class Ex7_MaiorLinha {
	int [][] matriz= new int [2][2];
	int [] soma = new int [2];
	int i=0;
	int j=0;
	int maior=0;
	
	void preencher() {
		Scanner sc = new Scanner(System.in);
		
		for( i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				System.out.println("Entre com os valores da matriz: ");
				matriz [i][j]= sc.nextInt();
				
				}
		}
		sc.close();
	}
	void imprimirMatriz() {
		System.out.println("Imprime a matriz ");
		for( i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				System.out.print(matriz [i][j]);
	
				}
			System.out.println();
		}
	}
	void somaMatriz() {
		for( i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				soma [i] += matriz [i][j];
				
		}	
	}
	}
	void imprimirduasLinhas() {
		System.out.println("Apresenta as duas Linhas somadas ");
		for( i=0; i<2; i++) {
			System.out.println(soma[i]);
			
			if(maior<soma[i]) {
				maior = soma[i];
				
		}	
	}
	}
	void imprimir() {
		System.out.println("A soma da maior linha foi:"+maior);	
	}
}
