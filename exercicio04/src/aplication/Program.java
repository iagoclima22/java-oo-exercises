package aplication;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor em dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quandos dólares serão comprados? ");
		double quantity = sc.nextDouble();
		
		double priceDolar = CurrencyConverter.pricingDolar(dolar, quantity);
		
		System.out.printf("Valor a ser pago em reais = %.2f", priceDolar);
		
		sc.close();

	}

}
