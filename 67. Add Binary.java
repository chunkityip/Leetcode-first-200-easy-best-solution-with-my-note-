/*Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

a: 11
b:  1
-------
   100  

a: 1010
b: 1011
--------
  10101

1. Create a StringBuilder name sb  ** because we are change the string and 
string is immutable
2. Create a integer i as a.length() -1
3. Create a integer j as b.length() -1
4. Create a integer carry =0;
5. while (i>=0 || j>=0)  //which will always true
6. Create a integer call sum, sum = carry;
7. if (i >= 0){
8. sum += a.charAt(i--) - '0' } //it basically show doing i--  - '0'. Cause i length are 2, will loop 2 times
9. if (j >= 0){
10. sum += b.charAt(j--) - '0' }  //it basically show doing i--  - '0' Cause i length are 1, will loop 1 times
11. sb.insert(0, sum %2);  putting sum %2 into index 0 of sb
12. carry = sum/2}
13. if (carr>0){
14. sb.insert(0, 1);
}
15. return sb.toString();

**For the 8 to 14. here is the following
sum += a.charAt(i--)[1] - '0' =1
sum += a.charAt(j--)[1]  - '0' = 1+1 =2

sb.insert (0, 2%2[0])    -->    sb = "0"
carry = 2/2 = 1

if(carry[1] > 0) **which is true
sb.insert(0,1)        -->  sb ="10"

do the while loop again

int sum = carry = 1//carry already insert 1 at lien 47

sum += a.charAt(i--)[1] - '0' =1 +1 =2
cause j only have 1 length , we already j--. Therefore, we can't do j--

sb.insert(0, 2%2)       -->sb= "100"

*/
class Solution{
    public String addBinart(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() -1;
        int j = b.length() -1;
        int carry =0;
        while( i>=0 || j>=0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i--) -'0';
            }

            if(j >= 0){
                sum += b.charAt(j--) -'0';
            }

            sb.insert (0, sum%2);
            carry = sum/2;
        }
        if(carry >0){
            sb.insert (0,1);
        }
        return sb.toString();
    }
}









