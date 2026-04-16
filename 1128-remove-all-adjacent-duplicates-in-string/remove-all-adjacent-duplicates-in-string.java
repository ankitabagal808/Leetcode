class Solution 
{
    public String removeDuplicates(String s) 
    {
        char stack[] = new char[s.length()];
        char ch[] = s.toCharArray();
        int top = -1;

        for (int i = 0; i < ch.length; i++)
        {
            if (top != -1 && stack[top] == ch[i])
            {
                top = top - 1; // pop
            }
            else
            {
                top = top + 1; // push
                stack[top] = ch[i];
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= top; i++)
        {
            sb.append(stack[i]);
        }

        return sb.toString();
    }
}