import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String text = input.nextLine();
		
		if (text.isEmpty()){
			System.out.print("The total string is 0");
		} 
		else {
			int i = 1;
			while (text.isEmpty() == false) {
				System.out.print("Enter a string: ");
				text = input.nextLine();
				i++;
			}
				
			
			System.out.println("The total strings are " + (i) );
		}
		input.close();
	}

	}


