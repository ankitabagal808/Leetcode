class Solution 
{
    public int[] concatWithReverse(int[] nums) 
    {
        int k = nums.length;
        int ans[] = new int[k*2];
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
        }
        for(int i = nums.length-1; i >= 0; i--)
        {
            ans[k++] = nums[i];
        }
        return ans;
    }
}