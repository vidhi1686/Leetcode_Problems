class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (char ch : s.toCharArray()) {
        //     if (ch == '(' || ch == '{' || ch == '[') {
        //         stack.push(ch);
        //     } 
        //     else {
        //         if (stack.isEmpty()) return false;
        //         char top = stack.pop();
        //         if (ch == ')' && top != '(') return false;
        //         if (ch == '}' && top != '{') return false;
        //         if (ch == ']' && top != '[') return false;
        //     }
        // }
        // return stack.isEmpty();

        while( s.contains("()") || s.contains("{}") || s.contains("[]")){
            s= s.replace("()","");
            s= s.replace("{}","");
            s= s.replace("[]","");
         }
         if(s.length()==0){
            return true;
         }
         return false;
    }
}