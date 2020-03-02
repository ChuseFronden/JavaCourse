import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
			int i,fact = 1;			
				for (i = 1; i <= 9; i++){
					fact=fact*i;
					System.out.println(i + "!" + " = " + fact);
				}
	}	
		private static double factorial (Scanner input) {
			return Integer.parseInt(input.nextLine());
			 }
	}


