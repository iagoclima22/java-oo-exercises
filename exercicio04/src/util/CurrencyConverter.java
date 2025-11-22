package util;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double pricingDolar(double dolar, double quantity) {
		return dolar * quantity * (1 + iof);
	}

}
