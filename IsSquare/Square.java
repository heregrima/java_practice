public class Square {  
    public static boolean isAnInteger(double x) {
      if (x == (int) x) {
        return true;
      }
      return false;
    }
  
    public static boolean isSquare(int n) {
      if (n < 0) {
        // negative numbers can't be squares
        return false;
      }
      if (isAnInteger(Math.sqrt(n))) {
        // the square root is not an integer, so the number is not a square number
        return true;
      }
      return false;
    }
}
