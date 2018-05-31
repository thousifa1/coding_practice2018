//https://leetcode.com/problems/reverse-integer/description/
//Reverse Integer
class Solution {
    public int reverse(int x) {
        int pos;
        String ans="";
        if(x<0)
        {
            pos = (-1)*x;
            ans=ans+"-";
        }
        else {pos =x;}
        
        String str=Integer.toString(pos);
        int len=str.length();
        char[] chars = str.toCharArray();
        int j=len-1;
        while(j>=0)
        {
           ans=ans+chars[j]; 
          j=j-1;  
        }
        
        try
        {
            int result=Integer.parseInt(ans);
            return result;
        }
        catch(NumberFormatException e )
        {
            return 0;
        }
                
                
					
                
    }
}


