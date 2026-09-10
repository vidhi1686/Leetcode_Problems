class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap < Character , String > map1 = new HashMap <>();
        HashMap < String , Character > map2 = new HashMap <>();
        char [] p =pattern.toCharArray();
         String[] words =s.split(" ");

          if (p.length != words.length) {
        return false;
    }
    for (int i = 0; i < p.length; i++) {

        if (map1.containsKey(p[i]) &&
            !map1.get(p[i]).equals(words[i])) {
            return false;
        }

        if (map2.containsKey(words[i]) &&
            map2.get(words[i]) != p[i]) {
            return false;
        }

        map1.put(p[i], words[i]);
        map2.put(words[i], p[i]);
    }

    return true;

        
    }
}