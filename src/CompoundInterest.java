import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial deposit: ");
		double a = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter interest rate: ");
		double b = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter capital income tax rate: ");
		double c = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter number of years: ");
		int d = Integer.parseInt(input.nextLine());
		double cal = 0;
		double rate = 0;
		double tax = a + cal - rate;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("\n");
	
		for (int x = 1; x <= d; x++) {
			cal = (tax * b) /100;
			rate = (cal * c) /100;
			tax += cal - rate;
			System.out.println(x + ": " +twoDecimals.format(tax));
				
				} 
		
			}

	}
