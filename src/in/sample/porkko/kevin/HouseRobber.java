package in.sample.porkko.kevin;

public class HouseRobber {

	public static void main(String[] args) {
		
		HouseRobber hr = new HouseRobber();
		int[] nums = {1,2,3,1};
		System.out.println("Maximum Sum is "+hr.checkHouse(nums));
	}
	
	public int checkHouse(int[] house) {
		if(house== null || house.length == 0) {
			return -1;
		}
		if(house.length == 1) {
			return house[0];
		}
		if(house.length == 2) {
			return Math.max(house[0],house[1]);
		}
		int[] dp = new int[house.length];
		dp[0] = house[0];
		dp[1]=  Math.max(house[0],house[1]);
		for(int i=2;i<house.length;i++) {
			dp[i] = Math.max(house[i]+dp[i-2], dp[i-1]);
		}
		
		
		return dp[house.length-1];
	}
}
