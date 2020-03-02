import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);              

		 System.out.print("Enter first string: ");   
		 String f = input.nextLine(); 
		 
		 System.out.print("Enter second string: ");   
		 String s = input.nextLine(); 
		 
		 if (f.equals(s)) {
		 System.out.println("Equal"); 
	}
		 else {
			 System.out.println("Not equal"); 
		 }

}
}