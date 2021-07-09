package CodingTest.LeetCode.Array.Medium;

import java.util.Arrays;

/*
Given a rectangular cake with height h and width w, and two arrays of integers horizontalCuts and verticalCuts where horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.

Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a huge number, return this modulo 10^9 + 7.

 

Example 1:



Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
Output: 4 
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green piece of cake has the maximum area.
Example 2:



Input: h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
Output: 6
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green and yellow pieces of cake have the maximum area.
Example 3:

Input: h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
Output: 9
 

Constraints:

2 <= h, w <= 10^9
1 <= horizontalCuts.length < min(h, 10^5)
1 <= verticalCuts.length < min(w, 10^5)
1 <= horizontalCuts[i] < h
1 <= verticalCuts[i] < w
It is guaranteed that all elements in horizontalCuts are distinct.
It is guaranteed that all elements in verticalCuts are distinct.
*/
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    final static int mod = 1000000007;
    
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long wid = 0, hei = 0;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        for(int i=1; i<horizontalCuts.length; i++) hei = Math.max(horizontalCuts[i] - horizontalCuts[i-1], hei);
        
        hei = Math.max(hei, Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length-1]));
        
        for(int i=1; i<verticalCuts.length; i++) wid = Math.max(verticalCuts[i] - verticalCuts[i-1], wid);
        
        wid = Math.max(wid, Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length-1]));
        
        return (int)((hei*wid)%mod);
    }
}
