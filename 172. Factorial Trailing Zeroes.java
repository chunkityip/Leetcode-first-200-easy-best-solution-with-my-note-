/* 172. Factorial Trailing Zeroes 

The question is asking how many integer 0 in there? Basically, there have only one soulation can have 0, 2 x 5 or n x5
Finding how many 5 also meaning finding how many 0 . Meaning that n/=5 
However, what about 5 x 5 ? like 26!. 26 have six 5 , 5(1x5), 10(2x5) , 15(3x5), 20(4x5) , 25 (5x5).
25 have two 5
Therefore, it should be f(n)=n/5+f(n/5)

It can use recursion and non-recursion way to do so 
*/

//Recursion
class Solution{
    ublic static int trailingZeroes(int n) {
        if (n<5)return 0;

        if (n<10)return 1;

        return (n/5+ trailingZeroes(n/5));
    }

//Non-Recursion
class Solution{
    public static int trailingZeroes(int n){
        int result = 0;
        while(n>0){
            result+=n/5;

            n/=5;
        }
        return result;
    }
}
