package problems;

import java.util.Arrays;
//using Greedy
public class MinNumberOfCoins {

	public static int[] reverse(int[] arr) {
		int[] rev=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rev[arr.length-i-1]=arr[i];
		}
		System.out.println("rev->"+Arrays.toString(rev));
	return rev;
	}
	
	public static int minCoinsNeeded(int[] arr,int amount) {
		int number=0;
		for(int i=0;i<arr.length;i++) {
			if(amount>=arr[i]) {
			int c=(int)Math.floor((amount/arr[i]));
			amount=amount-(c*arr[i]);
			number=number+c;
			}
			if(amount==0) {
				break;
			}
		
		}
	return number;
		
	}
	
	
	public static void main(String[] args) {
		int amount=57;
		int[] coins= {2,1,5,10};
		Arrays.sort(coins);
		//System.out.println(Arrays.toString(coins));	
		coins= reverse(coins) ;
	    int neededCoins= minCoinsNeeded(coins, amount);
		System.out.println(neededCoins );
	}

}
