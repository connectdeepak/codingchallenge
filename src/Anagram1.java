//You are given a string s, which is known to be a concatenation of anagrams of some string t.

//Return the minimum possible length of the string t.

//An anagram is formed by rearranging the letters of a string. For example,
//"aab", "aba", and, "baa" are anagrams of "aab".

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram1 {

	public static int minAnagramLength(String s) {
		
		
		
		
		char[] charArray = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for( int i=0 ; i < charArray.length ; i++) {
			charMap.put(charArray[i], charMap.getOrDefault(charArray[i], 0)+1);
		}
		
		return  charMap.keySet().size();
		

	}

	public static void main(String[] args) {
		
		//s = aabb   abab

	}

}
