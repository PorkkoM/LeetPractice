package in.sample.porkko.kevin;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
	
	List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

	public static void main(String[] args) {
		String st = "hello";
		ReverseVowels rv  = new ReverseVowels();
		System.out.println(rv.reverseVowelsTest(st));
	}
	
	public String reverseVowelsTest(String str) {
		char[] chs = str.toCharArray();
		int  i = 0,j = str.length()-1;
		while(i<=j) {
			char firstChar = str.charAt(i);
			if(list.contains(firstChar)) {
				while(j>=0) {
					char sc = str.charAt(j);
					if(list.contains(sc)) {
						chs[i] = sc;
						chs[j] = firstChar;
						j--;
						break;
					}
					j--;
				}
			}
			i++;
		}
		return String.valueOf(chs);
	}
	
}
