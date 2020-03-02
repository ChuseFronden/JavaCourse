import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		WordPair[] ArrayLanguageTranslation = { 
				new WordPair("bird", "lintu"), 
				new WordPair("bus", "bussi"),
				new WordPair("car", "auto"), 
				new WordPair("cat", "kissa"), 
				new WordPair("dog", "koira") 
				};
		
		System.out.print("Enter an English word: ");
		String englishW = input.nextLine();
		
		int count = 0;
		for (int i = 0; i < ArrayLanguageTranslation.length; i++) {
			if (englishW.equals(ArrayLanguageTranslation[i].getEnglishWord())) {
				System.out.print(ArrayLanguageTranslation[i].getFinnishWord());
				count++;
			}
		}
		
		if (count == 0) {
			System.out.print("Unknown word");
		}
	}
	}

public class WordPair {
	
	private String EnglishWord;
	private String FinnishWord;

	public WordPair(String EnglishWord, String FinnishWord) {

	 this.EnglishWord = EnglishWord;
	 this.FinnishWord = FinnishWord;
	
	}

	public String getEnglishWord() {
	 return EnglishWord;
	}

	public String getFinnishWord() {
	 return FinnishWord;
	}

	public void setWord(String EnglishWord) {
	 this.EnglishWord = EnglishWord;
	}

	public void setTranslate(String FinnishWord) {
	 this.FinnishWord = FinnishWord;
	}

	}