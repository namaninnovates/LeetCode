class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int type=0;
        boolean used[]=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++)
        {
        boolean placed=false;
            
            for(int j=0;j<baskets.length;j++)
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