class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int pointer=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
               pointer=i;
               break;
            }
        }
        if(pointer==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
       for(int i=nums.length-1;i>=pointer;i--)
        {
            if(nums[i]>nums[pointer])
            {
               int temp=nums[pointer];
               nums[pointer]=nums[i];
               nums[i]=temp;
               break;
            }
        }
        reverse(nums,pointer+1,n-1);
    }
    private void reverse(int[] arr,int left ,int right)
        {
            while(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
}