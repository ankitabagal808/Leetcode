import java.util.*;

class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) 
        {
            k = k + num[i];
            ans.add(k % 10);
            k = k / 10;
        }

        while (k > 0) 
        {
            ans.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}