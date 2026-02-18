package fundamentals.challenges;

import java.util.Locale;
import java.util.Scanner;

public class ConversionChallenge {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);

	Scanner Input = new Scanner(System.in);
	
	System.out.println("Enter the first salary: ");
	String value1= Input.next().replace(",", ".");
	
	System.out.println("Enter the second salary: ");
	String value2= Input.next().replace(",", ".");
	
	System.out.println("Enter the third salary: ");
	String value3= Input.next().replace(",", ".");
	
	double salary1= Double.parseDouble(value1); 
	double salary2= Double.parseDouble(value2); 
	double salary3= Double.parseDouble(value3); 
	
	double average= (salary1+salary2+salary3)/3;
	
	System.out.printf("The average of the salarys is %.2f: ",average);
	
	
	Input.close();
	

	}
	
}
