//https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){ return false;}
        else if(x==0) { return true; }
        else if(x>0 && x<10){return true;}
        else{
        String str=Integer.toString(x);
        int len=str.length();
        char[] chars = str.toCharArray();
        int i=0;
        int j=len-1;
        boolean flag = true;
        while (i!=j && i<j)
        {
            if (chars[i]==chars[j])
            {
                i=i+1;
                j=j-1;
            }
            else
            {
                flag=false;
                break;
            }
            
        }
        return flag;
        }
    }
}