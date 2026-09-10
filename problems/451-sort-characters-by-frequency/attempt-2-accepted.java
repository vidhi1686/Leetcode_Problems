
import java.util.*;

class Solution {
    public String frequencySort(String s) {

     
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

   
        List<Character> chars = new ArrayList<>(map.keySet());

     
        Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));

    
        String ans = "";

        for (char ch : chars) {

            int frequency = map.get(ch);

            for (int i = 0; i < frequency; i++) {
                ans = ans + ch;
            }
        }

        return ans;
    }
}

