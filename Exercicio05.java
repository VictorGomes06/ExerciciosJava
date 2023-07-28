package Exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		int codigoPeca01 = 10;
		int numDepecas01 = 0;
		double valorDaPeca01 = 0.0;
		double valorToalPeca01 = valorDaPeca01 * numDepecas01;
		
		int codigoPeca02 = 12;
		int numDepecas02 = 0;
		double valorDaPeca02 = 0.0;
		double valorToalPeca02 = valorDaPeca02 * numDepecas02;
		
		double total = valorToalPeca01 + valorToalPeca02;
		
		
		System.out.printf("Valor a Pagar : %.2f" ,total);
	}

}
