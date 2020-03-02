import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a positive odd integer: ");
			String a = input.next();
			while (a.equals("quit")) {

				try {
					int newa = Integer.parseInt(a);
					if (newa > 0 && newa % 2 == 1) {
						
						System.out.println("OK\n");
						System.out.print("Enter a positive odd integer: ");
						a = input.next();
						
						continue;
						
					} 
					else {
						
						System.out.println("  " + a + " is not a positive odd integer\n");
						System.out.print("Enter a positive odd integer: ");
						a = input.next();
						
					}
					
				} 
				catch (NumberFormatException ex) {
					
					System.out.println("  \'" + a + "\'" + " is not a positive odd integer\n");
					System.out.print("Enter a positive odd integer: ");
					a = input.next();
					
				}

			}
			System.out.println("Bye!");
		}
	}


