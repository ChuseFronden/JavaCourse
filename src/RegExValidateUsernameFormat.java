    
import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		if(string.matches("^[aeyiuoäöåAEYIUOÄÖÅ]+$")) {
			System.out.print("Vowels only");
		}
		else {
			System.out.print("Not only vowels!");
		}
	}
}