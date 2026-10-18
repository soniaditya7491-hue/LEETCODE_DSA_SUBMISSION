class Solution {
    public int maxArea(int[] ht)
    {
        int i=0;
        int j=ht.length-1;
        int maxArea=0;
      while(i<j)
      {
          int min=Math.min(ht[i],ht[j]);
          int area=min*(j-i);
          maxArea=Math.max(area,maxArea);
          if(ht[i]<ht[j])
          {
            i++;
          }
          else
          {
            j--;
          }
      }
      return maxArea;
    }
}