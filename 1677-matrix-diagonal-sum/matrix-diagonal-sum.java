class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i == j || j == n-1-i)
				{
					count += mat[i][j];
				}
			}
		}
        return count;
    }
}