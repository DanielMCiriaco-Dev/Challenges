package fundamentals.challenges;

public class TemperatureChallenge {

	public static void main(String[] args) {

		final double FACTOR = 5.0/9;
		final double FIX = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - FIX)* FACTOR;
		

		System.out.println("The result is: "+celsius+"°C");
 }
}