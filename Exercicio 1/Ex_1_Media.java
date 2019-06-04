/*1) Desenvolver um programa que crie uma matriz em Java e leia 5 
 * nomes e notas de uma turma. Calcule e exibe a média das notas da 
 * turma e em seguida exibe a relação de nomes cuja nota é superior 
 * a esta média
 */
package Ex_03_06;

import java.util.Scanner;

public class Ex_1_Media {

	public static void main(String[] args) {
		double media=0;
		int j=0;
		double result=0;
		String [] nome= new String[4];
		int [][] notas= new int[4][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite o nome do aluno " +(i+1)+":");
			nome[i]= sc.next();
			for(j=0; j<4; j++) {
				
				System.out.println("Digite a nota " +(j+1)+" do  "+nome[i]+":");
				notas[i][j]= sc.nextInt();
				
				media += notas[i][j];	
			}
			
			result = media /4;
			media=0;
			System.out.println("A media do aluno "+nome[i]+" e:"+result);
		}
		
sc.close();
	}

}
