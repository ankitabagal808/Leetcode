class Solution 
{
    public String removeDuplicateLetters(String s) 
    {

        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray()) 
        {
            freq[c - 'a']++;
        }

        String res = "";

        for (char c : s.toCharArray()) 
        {

            freq[c - 'a']--;

            if (used[c - 'a']) continue;

            while (res.length() > 0 &&
                   res.charAt(res.length() - 1) > c &&
                   freq[res.charAt(res.length() - 1) - 'a'] > 0) 
                   {

                used[res.charAt(res.length() - 1) - 'a'] = false;
                res = res.substring(0, res.length() - 1);
            }

            res += c;
            used[c - 'a'] = true;
        }

        return res;
    }
}