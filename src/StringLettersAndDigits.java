import java.util.Scanner;
public class StringLettersAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String first= input.nextLine();
		int textnum = 0;
		int digitnum = 0;
		for (int i = 0; i < first.length(); i++) {
			if (Character.isLetter(first.charAt(i))) {
				textnum++;
			}
		}
		for (int x = 0; x < first.length(); x++) {
			if (Character.isDigit(first.charAt(x))) {
				digitnum++;
			}
		}
				
			
		System.out.println(textnum + " letter(s)");
		System.out.println(digitnum + " digit(s)");

}
}
