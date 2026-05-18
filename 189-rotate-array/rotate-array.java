class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k % n;

        int[] result = new int[n];

        for(int i = 0; i < n; i++)
        {
            result[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++)
        {
            nums[i] = result[i];
        }


        // // Important
        // k = k % n;

        // for(int i = 0; i < k; i++)
        // {
        //     int temp = nums[n - 1];

        //     for(int j = n - 1; j > 0; j--)
        //     {
        //         nums[j] = nums[j - 1];
        //     }

        //     nums[0] = temp;
        // }
    }
}