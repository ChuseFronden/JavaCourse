import java.util.Scanner;
import java.util.Arrays;

public class ArrayElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter the number of candidates: ");
		 int nrofcandidates = Integer.parseInt(input.nextLine());
		 int[] numbers = new int[nrofcandidates];
		 
			for (int i = 0; i < nrofcandidates; i++) {
				System.out.print("Enter " + (i+1) + ". name: ");
				String name = (input.nextLine());
				System.out.print("Enter votes: ");
				numbers[i] = Integer.parseInt(input.nextLine());
			}
			Arrays.sort(numbers); 
			for (int x = 0; x < numbers.length; x++) {
				if(numbers[x]==numbers[x+1]) {
					System.out.println("The election is a tie between the following candidates:" + numbers);
				}
					else {
						System.out.println(numbers[0]);
					}
				}
			}
	}


