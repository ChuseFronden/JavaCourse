import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);              

		 System.out.print("Enter first string: ");   
		 String a = input.nextLine();       
		 
		 System.out.print("Enter a string: ");   
		 String b = input.nextLine(); 
		 
		 String c = new String("quit" );
		 int sum = 0;
		 while(b.equals(c)) {

			    System.out.println("Enter a string: ");
			    String guess = input.nextLine();
			    System.out.println(guess.length());
			   
			    for(int i = 0; i < guess.length(); i++) {

			       sum = sum+1;
			        }   

			    System.out.println(sum);
}
	}
}
