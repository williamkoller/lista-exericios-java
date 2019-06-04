/*3) Imprimir os 100 primeiros impares, a partir de um numero informado pelo
usuário.
*/

package Ex_03_06;

import java.util.Scanner;

public class Ex3_Impar {
	static int num=0;
	static void solicita() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Entre com um numero:");
		num = scan.nextInt();
		scan.close();	
	}
	static void impar() {
		int i=0;
		for(i=0;i<num;i++){
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		solicita();
		impar();

	}

}
