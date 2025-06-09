
public class LeftMostRepeatingCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// abccdb ->b

		leftMostRepeating("abccdb");

	}

	public static int leftMostRepeating(String s) {
		int CHAR = 256;
		int result = -1;
		int[] count = new int[CHAR];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {

			if (count[s.charAt(i)] > 1) {
				result = i;
				break;
			}

		}
		
		System.out.println("result " + result);
		return result;
	}

}
