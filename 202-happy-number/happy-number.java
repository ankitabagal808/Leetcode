import java.util.*;

class Solution 
{

    public boolean isHappy(int n) 
    {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) 
        {

            set.add(n);
            n = getSum(n);
        }

        return n == 1;
    }

    public int getSum(int n) 
    {

        int sum = 0;

        while (n > 0) 
        {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) 
    {

        Solution obj = new Solution();

        System.out.println(obj.isHappy(19));
        System.out.println(obj.isHappy(2));  
    }
}