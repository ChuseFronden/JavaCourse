import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
			
			Scanner input= new Scanner(System.in);
			System.out.print("Enter an integer: ");
			
			int a = Integer.parseInt(input.nextLine());
			MethodsLibrary b  = new MethodsLibrary();
			
			System.out.print(a +"! ="+ b.factorial(a));
		}

	}

public class MethodsLibrary {
	public static int factorial(int num) {
		int result = 1;
		if (num == 0) {
			return (result);
		} else {
			return num * factorial(num - 1);

		}

	}

}