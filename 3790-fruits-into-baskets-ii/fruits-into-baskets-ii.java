class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int s1=fruits.length;
        int s2=baskets.length;
        int type=0;
        boolean used[]=new boolean[s2];
        for(int i=0;i<s1;i++)
        {
        boolean placed=false;
            
            for(int j=0;j<s2;j++)
            {
                if(!used[j] && fruits[i]<=baskets[j])
                {
                    placed=true;
                    used[j]=true;
                    break;
                }
                    
                
            }
            
                if(!placed)
                {
                   type++; 
                }
        }
        return type;
        
    }
}