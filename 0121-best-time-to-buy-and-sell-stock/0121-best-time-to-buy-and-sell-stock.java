class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPerch=Integer.MAX_VALUE;
        int maxPro=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minPerch=Math.min(minPerch,prices[i]);
            
            maxPro=Math.max(maxPro,prices[i]-minPerch);
        }
       return maxPro;
    }
}