class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        String temp = "";
        String temp1 = "";
        int n = s.length() - 1;
        
        for(int i = n; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) 
            {
                temp += ch;
            }
        }
        String rev = new StringBuilder(temp).reverse().toString();
        return temp.equals(rev);
    }
}