import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		max();
	}
	public static void max() {	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first double: ");
		double a = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter second double: ");
		double b = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		double max;
		System.out.print("\n");
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		if (a > b) {
			System.out.println("The max value is " + twoDecimals.format(a));
		}
		else {
			System.out.println("The max value is " + twoDecimals.format(b));
		}
	}
}	
		
