import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] english = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
	      String[] finnish = {"lintu", "bussi", "auto", "kissa", "koira", "koulu" + 
	      		"kiitos", "kouluttaa", "opettaja"};
	      String word;
 
	      word = JOptionPane.showInputDialog("Enter an English word:");
	      sequentialSearch(english, word);  
	}
	      public static int sequentialSearch(new words[], int target)
	      {
	      int index;
	      int element;
	      boolean found;
	      index = 0;
	      element = -1;
	      found = false;

	      while (!found && index < words.length)
	      {
	         if (words[index] == target)
	         {
	            found = true;
	            element = index;
	         }
	         index++
	      }
	      return element;   
	}

}
