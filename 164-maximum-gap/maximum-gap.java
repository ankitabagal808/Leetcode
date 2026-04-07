class Solution 
{
    public int maximumGap(int[] nums) 
    {
        Arrays.sort(nums);

        int maxdiff = 0;
        if(nums.length < 0)
        {
            return 0;
        }
        else
        {
            for(int i = 1; i < nums.length; i++)
            {
                int currdiff = nums[i] - nums[i-1];
                if(currdiff > maxdiff)
                {
                    maxdiff = currdiff;
                }
            }
        }
        return maxdiff;
    }
}