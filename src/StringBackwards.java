import java.util.Scanner;
public class StringBackwards {

	  public static void main(String[] args)
	    {
	        System.out.print("Enter a string: ");
	         Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println(reverse);
	    }
	        private static double readDouble(Scanner input) {
				 return Double.parseDouble(input.nextLine().replace(',', '.'));
				 }

	    }
	