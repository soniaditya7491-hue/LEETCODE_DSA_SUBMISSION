class Solution {
    private boolean isNotAlphaNumeric(char ch)
    {
      if(ch>='0'&&ch<='9'|| ch>='A' && ch<='Z')
      {
           return false;
      }
      return true;
    }
    public boolean isPalindrome(String s) 
    {
        int left = 0;
        int right=s.length()-1;
        
        while(left<right)
        {
        char leftEle=Character.toUpperCase(s.charAt(left));
        char rightEle=Character.toUpperCase(s.charAt(right));
        if(isNotAlphaNumeric(leftEle))
        {  
            left++;continue;
        }
        if(isNotAlphaNumeric(rightEle))
          {
            right--;continue;   
          }
        
        if(leftEle!=rightEle)
        {
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
    
}