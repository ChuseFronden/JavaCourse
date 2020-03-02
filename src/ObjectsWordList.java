import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ObjectsWordList {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			ArrayList<String> WordList = new ArrayList<String>();
			System.out.print("Enter a word (quit ends): ");
			String word = input.nextLine();
			
			while (word.equals("quit") == false) {
				WordList.add(word);
					System.out.print("Enter a word (quit ends): ");
					word = input.nextLine();
			}
					
			for (int x = 0; x < WordList.size(); x++) {
						Collections.sort(WordList);
					System.out.println(WordList.get(x));
		}
				
}

		}


