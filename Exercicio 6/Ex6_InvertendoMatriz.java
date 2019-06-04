package Ex_03_06;
import java.util.Scanner;
public class Ex6_InvertendoMatriz {
	
	int [][] matriz= new int [3][3];
	int i=0;
	int j=0;
	
	void preencher() {
		Scanner sc = new Scanner(System.in);
		
		for( i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Entre com os valores da matriz: ");
				matriz [i][j]= sc.nextInt();
				
				}
		}
		sc.close();
	}
	void imprimir() {
		for( i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(matriz [i][j]);
	
				}
			System.out.println();
		}
	}
	void inverter() {
		for( j=0; j<3; j++) {
			for(i=0; i<3; i++) {
				System.out.print(matriz [i][j]);
	
				}
			System.out.println();
		}
	}
}
