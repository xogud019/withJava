package level1;
import java.util.*;

public class TwoSum{
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!list.contains(numbers[i]+numbers[j])) list.add(numbers[i]+numbers[j]);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}