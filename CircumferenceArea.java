package fundamentals.challenges;

public class CircumferenceArea {
	
	
	public static void main(String[] args) {
		int radius = 3;
		//This 'final' is used so that our variable cannot be changed
		final double PI = 3.14159;
		
		double area= PI * radius*radius;
		
		System.out.println(area);
		radius = 10;
		area = PI * radius*radius;
		System.out.println("Area = "+ area+"m2");
		
	}

}
 