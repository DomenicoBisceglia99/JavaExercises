package util;

public class Calcolatrice {
	
	public static double maggiore(double a, double b, double c, double d) {
		if(a > b && a>c && a>d) {
			return a;
		}else if(b>a && b>c && b>d) {
			return b;
		}else if(c>a && c>b && c>d) {
			return c;
		}
		return d;
	}
	
	public static double minore(double a, double b, double c, double d) {
		if(a < b && a<c && a<d) {
			return a;
		}else if(b<a && b<c && b<d) {
			return b;
		}else if(c<a && c<b && c<d) {
			return c;
		}
		return d;
	}

	public static double somma(double a, double b, double c, double d) {
		return a + b + c + d;
	}
	
	public static double somma(float a, float b) {
		return a + b;
	}
	
	public static double somma(int a, float b, long c) {
		return a + b + c;
	}
	
	public static double somma(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double prodotto(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	public static double media(double a, double b, double c, double d) {
		return (a + b + c + d)/4;
	}
}
