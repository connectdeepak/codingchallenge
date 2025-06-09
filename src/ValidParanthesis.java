
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
 */

import java.util.ArrayList;

public class ValidParanthesis {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		
		String input =  "()[]{}";
		System.out.println( isValid(input));
		
	}

	public static boolean isValid(final String s) {

		// check if the length is odd or even

		ArrayList<String> list = new ArrayList<String>();

		int length = s.length() % 2;

		if (length == 1) {
			return false;
		}
		// now

		for (Character c : s.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				list.add(Character.toString(c));
			}
			
			else if(c == ')'){
				String result = list.remove(list.size()-1);
				if (!result.equals(Character.toString('('))) {
					return false;
				}
				
			}
			else if( c == '}' ){
				String result = list.remove(list.size()-1);
				if (!result.equals( Character.toString('{'))) {
					return false;
				}
				
			}
			else if( c == ']'){
				String result = list.remove(list.size()-1);
				if (!result.equals( Character.toString('['))) {
					return false;
				}
				
			}
			else {
				return false;
			}


		}

		return list.size() == 0 ? true : false;

	}

}
