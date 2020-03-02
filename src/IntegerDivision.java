import java.text.DecimalFormat;
import java.util.Scanner;
public class IntegerDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int a = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter divisor: ");
		int b = Integer.parseInt(input.nextLine());
		
		int answer = a / b;
		int remainder = a - (b * answer);
		
		 System.out.println(a + " / " + b + " = " + answer + ", the remainder is " + remainder);
	}

}
