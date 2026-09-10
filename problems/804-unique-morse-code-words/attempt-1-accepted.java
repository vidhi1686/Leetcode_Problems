class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet <String> set = new HashSet <> ();
        String morse[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String word :words){
            String transformation = "";
            for( int i = 0; i<word.length(); i++){
                char ch = word.charAt(i);
                int index = ch -'a';
                transformation += morse[index];
               
            }
          
            set.add(transformation);
        }
        return set.size();

        
    }
}