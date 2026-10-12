import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
           int complement=target-arr[i];
           if(mp.containsKey(complement))
           {

             return new int[]{mp.get(complement),i};
             
           }
           mp.put(arr[i],i);
        }
        
        return new int[]{-1,-1};
    }
}