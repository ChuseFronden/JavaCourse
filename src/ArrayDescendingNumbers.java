import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] AddArray = new double[4];
		DecimalFormat twoDecimals = new DecimalFormat("0,00");
		for (int i = 0; i < AddArray.length; i++) {
			System.out.print("Enter " + (i+1) +"." + " number: ");
			AddArray[i] = Double.parseDouble(input.nextLine().replace(',', '.'));
			}
		
			
			for (int x = AddArray.length - 1; x >= 0; x--) {
				Arrays.sort(AddArray);
			System.out.print(AddArray[x] + " ");
				
			}
	}

}