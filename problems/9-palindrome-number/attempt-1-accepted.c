bool isPalindrome(int x) {
        
        if (x < 0 || (x && x % 10 == 0))
        {
            return false;
        }
        int a = 0;
        for (; a < x; x /= 10) 
        {
            a = a * 10 + x % 10;
        }
        return x == a || x == a / 10;
    
    
}