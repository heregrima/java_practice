import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BraceChecker {
  public static final char[] validOpeningBraces = {'[', '{', '('};
  
  protected boolean isOpeningBrace(char brace) {
    for (char c : validOpeningBraces) {
      if (brace == c) {
        return true;
      }
    }
    return false;
    
  }
  
  public boolean isValid(String braces) {
    List<Character> validationStack = new ArrayList();
    
    for (char c : braces.toCharArray()) {
      if (validationStack.size() == 0) {
        // add character to the stack
        validationStack.add(c);
        continue;
      }
      // check the char to see if it's an opening brace
      if (isOpeningBrace(c)) {
        // push c onto validationStack
        validationStack.add(c);
        continue;
      }
      // check the last char to see if it's an opening brace for the current c brace
      char lastChar = validationStack.get(validationStack.size() - 1);
      boolean popped = false;
            switch (lastChar) {
          case '(':
            if (c == ')') {
              // pop the validationStack
              validationStack.remove(validationStack.size() - 1);
              popped = true;
            }
            break;
          case '[':
            if (c == ']') {
              // pop the validationStack
              validationStack.remove(validationStack.size() - 1);
              popped = true;
            }
            break;
          case '{':
            if (c == '}') {
              // pop the validationStack
              validationStack.remove(validationStack.size() - 1);
              popped = true;
            }
            break;
      }
        if (!popped) {
          // push c onto validationStack
          validationStack.add(c);
        }
      }
      // if validationStack is empty after these iterations, then the braces are valid
      return (validationStack.size() == 0);
    }
}

