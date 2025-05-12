class Solution {          // we are checking from left of a and right of b, if same characters found upto some extent, we check for middle part of both the strings if they are palindrome then return true, otther wise false
// refer the testcase: a = "pvhmupgqeltozftlmfjjde",    b = "yjgpzbezspnnpszebzmhvp" ||

    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }
    public boolean check(String a, String b){
        int l = 0, r = a.length() - 1;
        while(a.charAt(l) == b.charAt(r)){
            l++; r--;
            if(l >= r) return true;
        }
        return  isSubstringPalindrome(a, l, r) || isSubstringPalindrome(b, l, r);
    }
    public boolean isSubstringPalindrome(String s, int start, int end){
        while(s.charAt(start) == s.charAt(end)){
            start++; end--;
            if(start >= end) return true;
        }
        return false;
    } 
}