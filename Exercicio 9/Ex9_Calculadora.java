/*9) Fazer um programa que receba uma determinada opera��o para um c�lculo matem�tico, 
 * sendo. 1 Soma, 2 subtra��o, 3 multiplica��o, 4 divis�o e 5 Sair. Cada opera��o deve 
 * realizar a opera��o e apresenta��o do resultado dentro de um m�todo. O usu�rio tamb�m 
 * deve informar dois n�meros inteiros. O programa deve retornar o resultado da opera��o 
 * recebida sobre estes dois n�meros e depois solicitar nova op��o. Sair do sistema quando
 *  digitar a op��o 5.
 */

package Ex_03_06;

public class Ex9_Calculadora {

	public static void main(String[] args) {
		
		Ex9_Calc calcular = new Ex9_Calc();
		
		calcular.mostrar();
		calcular.operacao();

	}

}
