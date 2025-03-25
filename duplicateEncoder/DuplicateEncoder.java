public class DuplicateEncoder {
  public static boolean isRepeated(String word, char character) {
    if (word.toLowerCase().indexOf(Character.toLowerCase(character)) != word.toLowerCase().lastIndexOf(Character.toLowerCase(character))) {
      return true;
    }
    return false;
  }
  
	static String encode(String word) {
    String translatedWord = "";
    for (int i = 0; i < word.length(); i++) {
      if (isRepeated(word, word.charAt(i))) {
        translatedWord += ')';
      } else {
        translatedWord += '(';
      }
    }
    
    return translatedWord;
  }
}
