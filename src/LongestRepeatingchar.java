import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingchar {

	public static void main(String[] args) {

		String s = "ABAB";

		// String s = "ABAA";

		// int k = 1;
		int k = 0;

		System.out.println("characterReplacement ##   " + characterReplacement(s, k));

	}

	public static int characterReplacement(String s, int k) {
		int left = 0;
		int maxlength = 0;
		int maxFreq = 0;
		int[] frequency = new int[26];

		for (int right = 0; right < s.length(); right++) {

			maxFreq = Math.max(maxFreq, ++frequency[s.charAt(right) - 'A']);

			int length = right - left + 1;

			if ((length - maxFreq) > k) {

				
				frequency[s.charAt(left) - 'A']--;
				left++;
			}
			length = right - left + 1;
			maxlength = Math.max(length, maxlength);
		}
		return maxlength;

	}

}
