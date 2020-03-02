
class WordPair {
	
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

	public String toString() {
	 return EnglishWord +  " = " + FinnishWord;
	}
	}

public class ObjectsWordPairArray {

	public static void main(String[] args) {
		WordPair[] wordArray = {
				new WordPair ("class", "luokka"),
				new WordPair ("object", "olio"),
				new WordPair ("variable", "muuttuja")
				};
				
			for (int i = 0; i < wordArray.length; i++) {
					System.out.println(wordArray[i]);
					}
					}
	}
