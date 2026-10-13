class Solution {
    public int findMaxConsecutiveOnes(int[] arr) 
    {
        int maxi=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=1)
            {
               count=0;
            }
            if(arr[i]==1)
            {
                count++;
            }
           maxi= Math.max(maxi,count);
        }
        return maxi;
    }
}