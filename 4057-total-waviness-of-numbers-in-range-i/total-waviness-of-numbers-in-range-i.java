class Solution 
{
    public int totalWaviness(int num1, int num2) 
    {
        int count = 0;
        
        while(num1 <= num2)
        {
            String str = String.valueOf(num1);
            for(int i = 1; i < str.length()-1; i++)
            {
                char pre = str.charAt(i-1);
                char mid = str.charAt(i);
                char pos = str.charAt(i+1);

                if((mid > pre && mid > pos) || (mid < pre && mid < pos)) 
                {
                    count++;
                }
            }
            num1++;
        }
        return count;
    }
}