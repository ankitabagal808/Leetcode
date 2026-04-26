class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        String temp = "";
        String temp1 = "";
        int n = s.length() - 1;
        
        // Step 1: create cleaned string (temp1)
        for(int i = n; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) // FIXED 47 → 48
            {
                temp1 = temp1 + ch;
            }
        }
        
        // Step 2: reverse cleaned string
        for(int i = temp1.length() - 1; i >= 0; i--)
        {
            char ch = temp1.charAt(i);
            temp = temp + ch;   // ❌ removed unnecessary if condition
        }
        
        // Step 3: compare
        if(temp.equals(temp1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}