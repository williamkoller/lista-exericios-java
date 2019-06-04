package Ex_03_06;
import java.util.Scanner;
public class Ex5_Soma {
	int [][] matriz= new int [3][3];
	int i=0;
	int j=0;
	int soma=0;
	
	
	void soma () {
		Scanner sc = new Scanner(System.in);
		
		for( i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Entre com os valores da matriz: ");
				matriz [i][j]= sc.nextInt();
				soma += matriz [i][j];
				}
		}
		sc.close();
	}
	void imprimir() {
		System.out.println(soma);
	}

}