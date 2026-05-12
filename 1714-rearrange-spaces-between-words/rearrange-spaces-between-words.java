class Solution 
{
    public String reorderSpaces(String text) 
    {
        int spaces = 0;

        for(char ch : text.toCharArray())
        {
            if(ch == ' ')
                spaces++;
        }

        String[] words = text.trim().split("\\s+");
        int n = words.length;

        String result = words[0];

        if(n == 1)
        {
            for(int i = 0; i < spaces; i++)
            {
                result = result + " ";
            }
            return result;
        }

        int gap = spaces / (n - 1);
        int extra = spaces % (n - 1);

        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < gap; j++)
            {
                result = result + " ";
            }
            result = result + words[i];
        }

        for(int i = 0; i < extra; i++)
        {
            result = result + " ";
        }

        return result;
    }
}