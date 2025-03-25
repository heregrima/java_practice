import org.apache.commons.lang3.StringUtils;

public class BitCounting {

	public static int countBits(int n){
    String binaryString = Integer.toBinaryString(n);
    return StringUtils.countMatches(binaryString, '1');
	}
	
}
