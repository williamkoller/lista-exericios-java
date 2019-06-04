package Ex_03_06;
import java.util.Scanner;
public class Ex9_Calc {
	int i=0;
	int a=0;
	int b=0;
	int r=0;
	int oper;


	void mostrar() {
		System.out.println("Operacoes disponiveis");
		System.out.println("'1' : soma");
		System.out.println("'2' : subtracao");
		System.out.println("'3' : multiplicao");
		System.out.println("'4' : divisao");
		System.out.println("Para sair digite: 5");
	}
	void operacao() {
		Scanner scan = new Scanner (System.in);
		for(;oper!=5;){
			System.out.println("Entre com o primeiro valor:");
	    	a = scan.nextInt();
	    	
	    	System.out.println("Entre com a operacao:");
	    	oper = scan.nextInt();
	    	
	    	System.out.println("Entre com o segundo valor:");
	    	b = scan.nextInt();
	    	
			if(oper==1){
	    		r=a+b;
	    		System.out.println(a+"+"+b+"="+r);
				}
	    	if(oper==2){
	    		r=a-b;
	    		System.out.println(a+"-"+b+"="+r);
	    		}
	    	if(oper==3){
	    		r=a*b;
	    		System.out.println(a+"*"+b+"="+r);
	    		}
			if(oper==4){
	    		r=a/b;
	    		System.out.println(a+"/"+b+"="+r);
	    		}
			if(oper==5){
				System.out.println("Fechando calculadora!");
				
				scan.close();
			}
		}
	}
}

