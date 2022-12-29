import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        List<Integer> keyList = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(Collections.max(map.values()))){
                keyList.add(entry.getKey());
            }
        }
        if (keyList.size() > 1) return answer;
        else return keyList.get(0);
    }
}