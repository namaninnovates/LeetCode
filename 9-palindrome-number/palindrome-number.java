class Solution {
    public boolean isPalindrome(int x) {
        int num;
        int orig=x;
        int rev=0;
        boolean palin=false;
        if(x<0)
        return false;
        while(x!=0)
        {
          num=x%10;
        x=x/10;
        rev=rev*10+num;  
        }
        if(orig==rev)
        {
            palin=true;
        }
        else
        palin=false;
        return palin;
        

        
    }
}