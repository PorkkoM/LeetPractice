package in.sample.porkko.kevin;

public class Microsoft1 {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		char[] ch =s.toCharArray();
		int i=0;
		int j = ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--]=temp;
		}
		System.out.println(new String(ch));
	}
}
