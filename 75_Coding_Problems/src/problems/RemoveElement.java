package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

		public static int remove(int[] arr,int val) {
		
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
		if(arr[i]==val)
			continue;
		al.add(arr[i]);
			}
			for(int i=0;i<al.size();i++) {
				arr[i]=al.get(i);
			}
		//Integer[] prr=new Integer[al.size()];
			// prr=al.toArray(prr);	
		System.out.println(Arrays.toString(arr));
		return al.size();
		}
	public static void main(String[] args) {
		//Input: nums = [0,1,2,2,3,0,4,2], val = 2
		//Output: 5, nums = [0,1,4,0,3,_,_,_]

	int[] nums= {3,2,2,3};
	int val=3;
		remove(nums, val);
	}

}
