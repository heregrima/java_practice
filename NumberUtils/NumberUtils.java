public class NumberUtils {

    public static boolean isNarcissistic(int number) {
      String temp = Integer.toString(number);
      int[] digits = new int[temp.length()];
      for (int i = 0; i < temp.length(); i++)
      {
          char tempChar = temp.charAt(i);
          digits[i] = tempChar - '0';
      }
      
      int total = 0;
      for (int digit : digits) {
          total += (int) Math.pow(digit, digits.length);
      }
      
      if (total == number) {
         return true;
      }
      return false;
    }

}
