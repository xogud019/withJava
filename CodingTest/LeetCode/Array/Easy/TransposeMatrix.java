package CodingTest.LeetCode.Array.Easy;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        
        int[][] answer = new int[col][row];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[j][i] = A[i][j];
            }
        }
        return answer;
    }
}
