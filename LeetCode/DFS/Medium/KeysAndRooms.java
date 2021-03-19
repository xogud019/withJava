package LeetCode.DFS.Medium;

import java.util.Stack;
import java.util.List;
/*
There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 

Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.

Initially, all the rooms start locked (except for room 0). 

You can walk back and forth between rooms freely.

Return true if and only if you can enter every room.

Example 1:

Input: [[1],[2],[3],[]]
Output: true
Explanation:  
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.

Example 2:

Input: [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can't enter the room with number 2.

Note:
1.1 <= rooms.length <= 1000
2.0 <= rooms[i].length <= 1000
The number of keys in all rooms combined is at most 3000.
*/
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stk = new Stack<>();
        
        visited[0] = true;
        stk.push(0);
        
        while(!stk.isEmpty()){
            int key = stk.pop();
                        
            for(int i:rooms.get(key)){
                if(!visited[i]){
                    visited[i] = true;
                    stk.push(i);
                }
            }
        }
        
        for(boolean v:visited){
            if(!v) return false;
        }
        
        return true;
    }

    /*
    boolean[] visited;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        
        dfs(rooms, visited, 0);
        
        for(boolean b : visited){
            if(!b) return false;
        }
        
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms, boolean[] visited, int idx){
        for(int i : rooms.get(idx)){
            if(!visited[i]){
                visited[i] = true;
                dfs(rooms, visited, i);
            }
        }
    }
    */
}
