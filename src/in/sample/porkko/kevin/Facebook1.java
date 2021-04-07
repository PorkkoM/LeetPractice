package in.sample.porkko.kevin;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Facebook1 {

	public static void main(String[] args) {
		Facebook1 fb = new Facebook1();
		Interval in1 = new Interval(0, 30);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(15, 30);
		Interval[] arra = new Interval[] {in1,in2,in3};
		System.out.println("The Miniumum number of room requiered--->"+fb.findInterval(arra));
	}
	
	public int findInterval(Interval[] intv) {
		if(intv==null||intv.length==0) return 0;
		Arrays.sort(intv,(a,b)->a.start-b.start);
		System.out.println(intv);
		PriorityQueue<Interval> minHeap = new PriorityQueue<Interval>((a,b)->a.end-b.end);
		System.out.println(minHeap);
		for(int i=0;i<intv.length;i++) {
			Interval curr = intv[i];
			Interval ear = minHeap.remove();
			if(curr.start >= ear.end) {
				ear.end =curr.end;
			}else {
				minHeap.add(curr);
			}
			minHeap.add(ear);
		}
		return minHeap.size();
	}
	
}
