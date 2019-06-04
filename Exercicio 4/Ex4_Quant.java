package Ex_03_06;

import java.util.Scanner;

public class Ex4_Quant {
	int num=0;
	 int i=0;
	 int  soma=0;
	 int maior=0;
	 int menor=9999999;
	 
	 void solicita() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Entre com a quantidade de numeros:");
		num = scan.nextInt();
		int [] x= new int[num];
		
		while(i<num & num!=-1) {
			System.out.println("Digite os numeros:");
				x[i] = scan.nextInt();
				i++;
			}
		for(int i=0;i<num;i++) {
			soma += x[i];
			
			} 
		System.out.println("A soma é:"+soma);
		
		
		for(int i=0;i<num;i++) {
			if(maior<x[i]) {
				maior = x[i];
				
				}
			}
		System.out.println("Maior:" +maior);
		
		for(int i=0;i<num;i++) {
			if(menor>x[i]) {
				menor = x[i];
				
				}
			System.out.println("Menor:" +menor);
		scan.close();
		}	
	 }
	}			

