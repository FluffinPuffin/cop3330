// Chloe Becker
// COP 3330
// 10/25/2024
// Assignment 5

import java.util.Stack;

public class WordScramble {
	
	public static String encode(String input) {
		// create stack object
		Stack<String> stack = new Stack<String>();
		// create string or a stringbuilder object
		StringBuilder st = new StringBuilder();
		// iterate over the input string looking at each character
			for(int i = 0; i <input.length(); i++) {
				char letter = input.charAt(i);
				String newStr = String.valueOf(letter);
				// 1 do nothing
				if (newStr.equals("1")) {
					continue;
				// 2 add to string/stringbuilder what pops out of stack
				}else if (newStr.equals("2")) {
					if (!stack.isEmpty()) {
						st.append(stack.pop());
					}
					if (!stack.isEmpty()) {
						st.append(stack.pop());
					}
				// vowl, add it to stack
				} else if (newStr.equals("a") || newStr.equals("e") || newStr.equals("i") || newStr.equals("o") || newStr.equals("u") || newStr.equals("A") || newStr.equals("E") || newStr.equals("I") || newStr.equals("O") || newStr.equals("U")) {
					stack.add(newStr);
				// print otherwise/add value to string
				} else {
					st.append(newStr);
				}
			}
		// return string/stringbuilder
		String strings = "";
		strings = String.valueOf(st);
		return strings;
	}
	
	public static void main(String[] args) {
		   System.out.println(encode("1cat2"));
		   System.out.println(encode("11top2e1cat22"));
		   System.out.println(encode("111tom2op2it2"));
		   System.out.println(encode("11top2i1tom22"));
	}
}
