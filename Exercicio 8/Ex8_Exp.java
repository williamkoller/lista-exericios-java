package Ex_03_06;
import java.util.Scanner;
public class Ex8_Exp {
	int exp=0;
	int x = 0;
	int i=0;
	int result = 1;
	
	void preencher() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre Exponenciação: ");
		exp = sc.nextInt();
		System.out.println("Entre numero: ");
		x = sc.nextInt();
		sc.close();
		}
	
	void calcula() {
		for( i=0; i<exp; i++) {
			result *= x;
			}
	}
	void imprimir() {
		System.out.println("Resultado:"+result);
	}
}
