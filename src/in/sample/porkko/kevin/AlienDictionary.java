package in.sample.porkko.kevin;

public class AlienDictionary {

	public static void main(String[] args) {
		AlienDictionary ad = new AlienDictionary();
		String[] words = {"apple","app"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(ad.isAlienDict(words, order));
	}
	
	public boolean isAlienDict(String[] words ,String order) {
		int[] alph = new int[26];
		for(int i=0;i<order.length();i++) {
			alph[order.charAt(i)-'a']=i;
		}
		for(int i =0; i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				int min = Math.min(words[i].length(), words[j].length());
				for(int k=0;k<min;k++) {
					
					int iChar = words[i].charAt(k);
					int jChar = words[j].charAt(k);
					if(alph[iChar-'a']< alph[jChar-'a']) {
						break;
					}else if(alph[jChar-'a'] < alph[iChar-'a']) {
						return false;
					}else if(k == min-1 && words[i].length() > words[j].length()) {
						return false;
					}
					
				}
				
			}
		}
		return true;
	}
	
	
}
