package LeetCode.Greedy.Medium;
//kadane
/*
You are given an integer array nums. The absolute sum of a subarray [numsl, numsl+1, ..., numsr-1, numsr] is abs(numsl + numsl+1 + ... + numsr-1 + numsr).

Return the maximum absolute sum of any (possibly empty) subarray of nums.

Note that abs(x) is defined as follows:

If x is a negative integer, then abs(x) = -x.
If x is a non-negative integer, then abs(x) = x.
 

Example 1:

Input: nums = [1,-3,2,3,-4]
Output: 5
Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
Example 2:

Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
 

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
*/
public class MaximumAbsoluteSumOfAnySubarray {
    public int maxAbsoluteSum(int[] nums) {
        int max =-10001;
        int min = 10001;
        int MAX = -10001;
        int MIN = 10001;

        for(int i=0; i<nums.length; i++){
            max = Math.max(max+nums[i], nums[i]);
            min = Math.min(min+nums[i], nums[i]);
            
            MAX = Math.max(MAX, max);
            MIN = Math.min(MIN, min);
        }
        
        return Math.max(Math.abs(MAX),Math.abs(MIN));
    }
}
