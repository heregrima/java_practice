public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String phoneNumber = new String();
    
    if (numbers.length != 10) {
      System.out.println("Must have a total of 10 numbers passed into this method");
      return "";
    }
    
    int count = 1;
    for (int digit: numbers) {
      if (count == 1) {
        phoneNumber += "(";
        phoneNumber += digit;
        count++;
        continue;
      } else if (count == 4) {
        phoneNumber += ") " + digit;
        count++;
        continue;
      } else if (count == 7) {
        phoneNumber += "-";
        phoneNumber += digit;
        count++;
        continue;
      } else {
        phoneNumber += digit;
        count++;
        continue;
      }
    }
    System.out.println(phoneNumber);
    
    return phoneNumber;
      
  }
}
