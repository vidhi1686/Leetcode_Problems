class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left =0;
        int right=s.length() - 1;
        while(left<=right){
            char leftMost= s.charAt(left);
            char rightMost =s.charAt(right);
            if(!Character.isLetterOrDigit(leftMost)){
                left++;
            }
            else if (!Character.isLetterOrDigit(rightMost)){
                right --;
            }
            else{
                if(Character.toLowerCase(leftMost)!=Character.toLowerCase(rightMost)){
                   return false; 
                }
                left++;
                right--;
            }
        }
        return true;
        
    }
}