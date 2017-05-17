package mvc.model;

public class Conversor {
	private static final double RATE = 1.109505;
	public double eurosToDollars (double euros){
		return euros*RATE;
	}
	
	public double dollarsToEuros (double dollars){
		return dollars * 1/RATE;
	}
	
}
