class Solution 
{
    public int compress(char[] chars) 
    {
        int count = 1;
        int k = 0;
        for(int i = 0; i < chars.length; i++)
        {
            if(i < chars.length-1 && chars[i] == chars[i+1])
            {
                count++;
            }
            else
            {
                chars[k++] = chars[i];
                if(count > 1)
                {
                    String str = count + "";
                    for(int j = 0; j < str.length(); j++)
                    {
                        chars[k++] = str.charAt(j);;
                    }
                }
                count = 1;
            }
        }
        return k;
    }
}