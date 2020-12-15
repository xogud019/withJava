package LeetCode.BinarySearch.Easy;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c:letters){
            if(c>target) return c;
        }
        
        return letters[0];
    }
}
