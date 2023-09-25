package problems;

import java.util.HashMap;

public class PalindromeNumber {

	
		
		  public static boolean isPalindrome(int x) {
			       
			    int num3=x;
					int num2=0;
					
					while(num3>0) {
						num2=num2*10+(num3%10);
						num3=num3/10;
				
					}
					if(x==num2)
				return true;
					
					return false;
			    
			    
			    //my code ends
			    }
		
		
		
	

	
	public static void main(String[] args) {

	int x =121;
	boolean flag=isPalindrome(x);
	System.out.println(flag);
	}

}
