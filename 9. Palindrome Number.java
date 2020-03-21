/* 9. Palindrome Number

1.Create a empty integer call temp
2.Also create a empty integer call Palindrome
3. Create another interger call original , original = x
5. if(x ==0){  * 0 is a palindrome
return true}
6. if(x < 0 or x %10 ==0) *x small than 0 or x%10 is 0
return false}
7 while(x>0){
8. temp= x%10;
9. palindrome =  palindrome*10 + original ;
10. x/=10;
}
11. return original == palindrome;
}
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x< 0 || x%10 ==0){
            return false;
        }
        int palindrome =0;
        while(x>palindrome){
            palindrome = palindrome * 10 +  x % 10; 
            x/=10;
    }
        return x == palindrome || x == palindrome/10;
    }
}