class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 95)
            {
                count++;
            }
        }
        if((count == word.length()) || (count == 0) || (count == 1 &&
         word.charAt(0) >= 65 && word.charAt(0) <= 90))
        {
            return true;
        }
        return false;
    }
}