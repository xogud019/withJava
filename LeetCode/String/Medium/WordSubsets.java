package LeetCode.String.Medium;

import java.util.ArrayList;
import java.util.List;
/*
We are given two arrays A and B of words.  Each word is a string of lowercase letters.

Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".

Now say a word a from A is universal if for every b in B, b is a subset of a. 

Return a list of all universal words in A.  You can return the words in any order.

 

Example 1:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
Output: ["facebook","google","leetcode"]
Example 2:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
Output: ["apple","google","leetcode"]
Example 3:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","oo"]
Output: ["facebook","google"]
Example 4:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["lo","eo"]
Output: ["google","leetcode"]
Example 5:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
Output: ["facebook","leetcode"]
 

Note:

1 <= A.length, B.length <= 10000
1 <= A[i].length, B[i].length <= 10
A[i] and B[i] consist only of lowercase letters.
All words in A[i] are unique: there isn't i != j with A[i] == A[j].
*/
public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> answer = new ArrayList<>();
        
        int[] b = new int[26];
        //System.out.println(b[0]);
        for(String str:B){
            int[] temp = countChar(str);
            
            for(int i=0; i<26; i++){
                b[i] = Math.max(b[i], temp[i]);
            }
        }
        
        //for(int i:b) System.out.print(i+" ");
        
        loopA:for(String str:A){
            int[] temp = countChar(str);
            
            for(int i=0; i<26; i++){
                if(temp[i] < b[i]) continue loopA;
            }
            
            answer.add(str);
        }
        
        return answer;
    }   
    
    public int[] countChar(String str){
        int[] arr = new int[26];
        
        for(char c:str.toCharArray()) arr[c-'a']++;
        
        return arr;
    }
}
