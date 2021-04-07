package in.sample.porkko.kevin;

import java.util.HashSet;
import java.util.Set;

public class Microsoft2 {
 
	public static void main(String[] args) {
		
		int[][] arr= {{2,1,1},{0,1,1},{1,0,1}};
		Set<String> fresh = new HashSet<>();
		Set<String> rotten = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==2) {
					rotten.add(""+i+j);
				}
				if(arr[i][j]==1) {
					fresh.add(""+i+j);
				}
			}
		}
		 System.out.println(""+fresh);
		 System.out.println(""+rotten);
		int min= 0;
		int[][] direc = {{0,1},{1,0},{-1,0},{0,-1}};
		while(fresh.size()>0) {
			Set<String> inf = new HashSet<>();
			for(String s:rotten) {
				 int i=s.charAt(0)-'0';
				 int j=s.charAt(1)-'0';
				 for(int[] direct : direc) {
					 int nextI = i+direct[0];
					 int nextj = j+direct[1];
					 System.out.println(""+nextI+nextj);
					 if(fresh.contains(""+nextI+nextj)) {
						 fresh.remove(""+nextI+nextj);
						 inf.add(""+nextI+nextj);
					 }
				 }
			}
			if(inf.size()==0) {
				System.out.println("-1");
				break;
			}
			rotten = inf;
			min++;
		}
		System.out.println(""+min);
	}
	
}
