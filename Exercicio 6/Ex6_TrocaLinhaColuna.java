/*6) Desenvolva um programa que tenha uma matriz 3 x 3 e realize a invers�o da matriz. 
 * O que � linha vira coluna e o que � coluna vira linha.
 */

package Ex_03_06;

public class Ex6_TrocaLinhaColuna {

	public static void main(String[] args) {
		
		Ex6_InvertendoMatriz matriz = new Ex6_InvertendoMatriz();
		
		matriz.preencher();
		matriz.imprimir();
		matriz.inverter();
		}
	}


