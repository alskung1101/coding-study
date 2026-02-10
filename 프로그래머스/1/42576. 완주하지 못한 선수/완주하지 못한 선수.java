import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 카운트
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 차감
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 남은 사람 찾기
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        return "";
    }
}
