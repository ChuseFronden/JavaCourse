import java.util.Scanner;

public class MethodsSecond {
		public static void main(String[] args) {
			printRectangle();
	        }
		
		public static void printRectangle () {
				Scanner input = new Scanner(System.in);  
				System.out.print("Enter grade (0-5): ");
				int a = Integer.parseInt(input.nextLine());
				
				System.out.print("Enter height:");
				int b = Integer.parseInt(input.nextLine());
				for (int w = 1; w <= b; w++)
		        {
		            for (int h = 1; h <= a; h++)
		            {
		                System.out.print("X");
					}
		            System.out.println();
				 }
		}
	}

