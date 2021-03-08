package com.sumit;

public class Solution {
	
   public static boolean isPalindrome(int x) {
        
        int pal = 0;
        int last =0;
        int original =x;
        
        if(x<0)
        {
            return false;
        }
    
          while(x>0)
         {
           last = x%10;
           pal = pal*10 + last;
           x = x/10;
         }
          
         return original==pal;
    }
   
   public static void main(String[] args) {
	System.out.println(Solution.isPalindrome(-121));
   }

}
