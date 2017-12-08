package com.br.modelagem.simulacao;

import javax.swing.JOptionPane;

public class MetodoCongruencia {
	
	public static void main(String[] args) {
		int x,i,result;
		int xn=194, a=34,c=91,m=78; //xn é a semente
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números que deseja gerar:"));
		for(i = 0;i<x;i++){
			result = ((a*xn+c) % m);
			System.out.println(result);
			xn = result; //Utilizar o resto como valor semente
		}
	}
}
