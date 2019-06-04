/*9) Fazer um programa que receba uma determinada operação para um cálculo matemático, 
 * sendo. 1 Soma, 2 subtração, 3 multiplicação, 4 divisão e 5 Sair. Cada operação deve 
 * realizar a operação e apresentação do resultado dentro de um método. O usuário também 
 * deve informar dois números inteiros. O programa deve retornar o resultado da operação 
 * recebida sobre estes dois números e depois solicitar nova opção. Sair do sistema quando
 *  digitar a opção 5.
 */

package Ex_03_06;

public class Ex9_Calculadora {

	public static void main(String[] args) {
		
		Ex9_Calc calcular = new Ex9_Calc();
		
		calcular.mostrar();
		calcular.operacao();

	}

}
