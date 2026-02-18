package fundamentals.challenges;

public class ArithmeticOperatorsChallenge {
	
	public static void main(String[] args) {
		//Math.pow(Base,Exponent)
		
		double a=(6*(3+2));
		
		a=Math.pow(a, 2);
		
		a=a/(3*2);
		
		System.out.println(a);
		
		double b=((1-5)*(2-7)/2);
	
		b=Math.pow(b, 2);
		System.out.println(b);
		double c=a-b;
		System.out.println(c);
		c=Math.pow(c, 3);
		System.out.println(c);
		c=(c)/Math.pow(10, 3);
		System.out.println(c);
		
		System.out.println("The challenge answer is: "+c);
		
		
	}

}
