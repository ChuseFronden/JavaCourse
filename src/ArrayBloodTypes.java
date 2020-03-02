import java.util.Arrays;
import java.util.Scanner;


public class ArrayBloodTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter blood type: ");
		String[] bloodArray = {"A+", "O-", "AB+", "O+", "AB+", "AB+", 
				"O-", "AB+", "O+", "AB+"}; 
	String bloodtype = input.nextLine();
	if (bloodtype.equals("AB+")) {
		System.out.print("50, 0%");
	}
	else if (bloodtype.equals("A+")){
		System.out.print("10, 0%");
	}
	else if (bloodtype.equals("O+")){
		System.out.print("20, 0%");
	}
	else if (bloodtype.equals("O-")){
		System.out.print("20, 0%");
	}
	else {
		System.out.print("0, 0%");
	}
	}
}
	   
