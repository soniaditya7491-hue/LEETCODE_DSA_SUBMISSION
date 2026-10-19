class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxProduct=Integer.MIN_VALUE;
        int Pro=1;
        for(int i=0;i<nums.length;i++)
        {
             Pro=Pro*nums[i];
              maxProduct=Math.max(maxProduct,Pro);
            if(Pro==0)
            {
                Pro=1;
            }
           
        }
         Pro=1;
        for(int i=nums.length-1;i>=0;--i)
        {
             Pro=Pro*nums[i];
              maxProduct=Math.max(maxProduct,Pro);
            if(Pro==0)
            {
                Pro=1;
            }
           
        }
        return maxProduct;
    }
}