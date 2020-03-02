import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
		System.out.print("Enter a non-negative integer: ");
		int a = Integer.parseInt(input.nextLine());
			if (a >= 0){
				int i,fact = 1;
				int number = a;
				for (i = 1; i <= a; i++){
					fact=fact*i;
				}
					System.out.println(a + "!" + " = " + fact);
				}
			else {
				System.out.println("Please enter a non-negative integer.");
			}
			}
		 
		catch (NumberFormatException nfe) {       
			  System.out.println("Please enter a non-negative integer.");   
			  } 
	}

}
