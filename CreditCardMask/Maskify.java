public class Maskify {
    public static String maskify(String str) {
        // use StringBuilder since you can set characters in it without creating new strings (because they're immutable)
        StringBuilder strSb = new StringBuilder(str);
        final int strSize = strSb.length();
        final int offset = 4;
      
        // run a loop through the first n characters, where n is 4 less than the maximum size and replace with #
        for (int i = 0; i < strSize - offset; i++) {
            strSb.setCharAt(i, '#');
        }
      
        return strSb.toString();
    }
}
