import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();
        
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            int count = participantMap.get(name);
            if (count == 1) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, count - 1);
            }
        }
        
        for (String name : participantMap.keySet()) {
            return name;
        }
        
        return "";
    }
}