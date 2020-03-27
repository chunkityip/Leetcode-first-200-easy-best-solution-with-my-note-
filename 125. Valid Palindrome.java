/* 125. Valid Palindrome 

It basically using two pointer , one putting first position, one putting last position
also we need to make all character to lowercase and remove space and not character string 

1.Create a boolean method call isAlphanumeric (char c)
if 'a'<=c && c<='z' || 'A'<=c && c<='Z' ||'0'<=c && c<='9', return true
else return false 

2. In isPalindrome method 
Create a Integer call length, length = c.length;
s= s.toLowerCase();   **making sure all character in s is lower case 
Create a Integer call i and j , i =0, j = length -1     i is pointer to front,  j is pointer to backword

while(i<j){
    while(!isAlphanumeric(s.charAt(i))){
        i++;         //jump the illegal character

        if (i == len){
            return true;   //to avoid something like "  "
        }
    }

    while(!isAlphanumeric(s.charAt(j))){
        j--;        
    }

    if(s,chratAt(i)!=s.charAt(j)){   // if pointer i and pointer j is not the same
        return false;
    }

    i++;  //keep looping
    j--;
}
return true;
*/

private boolean isAlphanumeric(char c) {
    if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9') {
        return true;
    }
    return false;
}

class Solution{
public boolean isPalindrome(String s) {
    int len = s.length();
    s = s.toLowerCase();
    int i = 0, j = len - 1;
    while (i < j) {
        while (!isAlphanumeric(s.charAt(i))) {
            i++;

            if (i == len) {
                return true;
            }
        }
        while (!isAlphanumeric(s.charAt(j))) {
            j--;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true; 
}
}

