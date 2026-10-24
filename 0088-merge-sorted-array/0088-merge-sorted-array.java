class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int []arr=new int[nums1.length];
        int k=0;
        int i=0;
        int j=0;
          while(i<m && j<n)
          {
             if(nums1[i]<=nums2[j])
             {
                arr[k]=nums1[i];
                i++;
                k++;
             }
             else
             {
                arr[k]=nums2[j];
                j++;
                k++;
             }
          }
          while(i<m)
          {
           arr[k]=nums1[i];
                i++;
                k++;
          }
          while(j<n)
          {
             arr[k]=nums2[j];
                j++;
                k++;
          }
      for(int r=0;r<nums1.length;r++)
      {
        nums1[r]=arr[r];
      }  
    }
}