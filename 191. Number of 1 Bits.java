/* 191. Number of 1 Bits 

Also by using >>> , & and | to solve the problem 

First solution */
class Solution{
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            count+=(n&1);
            n>>>=1;
        }
        return n;
}

/*Second solution from leetcode
There have a way to make the right [1] to [0]
For example: 10 bits of [10] and 2 bits of [10] is 1010. When we using & compare to [9], which is 
10 & 9 = (1010)&(1001)=1000. Meaning that the left of 1010 is 0
*/
class Soultion{
public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
        n &= (n - 1);
        count += 1;
    }
    return count;
}
}


