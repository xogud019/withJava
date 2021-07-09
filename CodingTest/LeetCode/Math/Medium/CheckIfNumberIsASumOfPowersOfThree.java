package CodingTest.LeetCode.Math.Medium;
/*
Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.

An integer y is a power of three if there exists an integer x such that y == 3x.

 

Example 1:

Input: n = 12
Output: true
Explanation: 12 = 31 + 32
Example 2:

Input: n = 91
Output: true
Explanation: 91 = 30 + 32 + 34
Example 3:

Input: n = 21
Output: false
 

Constraints:

1 <= n <= 107
*/
public class CheckIfNumberIsASumOfPowersOfThree {
    public boolean checkPowersOfThree(int n) {
        int num = n;
        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
            sb.append(""+num%3);
            num /=3;
        }
        
        for(char c:sb.toString().toCharArray()){
            if(c != '0' && c != '1') return false;
        }
        
        return true;
    }
}
