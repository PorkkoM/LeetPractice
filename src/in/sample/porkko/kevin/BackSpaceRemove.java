package in.sample.porkko.kevin;

import java.util.Stack;

public class BackSpaceRemove {
	
	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		BackSpaceRemove sd =new BackSpaceRemove();
		System.out.println(""+sd.checkBkspace(s, t));
	}

	public boolean checkBkspace(String s,String t) {
		Stack<Character> sStack= new Stack<Character>();
		Stack<Character> tStack= new Stack<Character>();
		for(char c : s.toCharArray()) {
			if(c != '#') {
				sStack.push(c);
			}else if(!sStack.isEmpty()) {
				sStack.pop();
			}
		}
		for(char c : t.toCharArray()) {
			if(c != '#') {
				tStack.push(c);
			}else if(!tStack.isEmpty()) {
				tStack.pop();
			}
		}
		
		while(!sStack.isEmpty()) {
			char cur = sStack.pop();
			while(tStack.isEmpty() || tStack.pop()!=cur) {
				return false;
			}
			
		}
		
		
		return sStack.isEmpty() && tStack.isEmpty();
		
	}
}
