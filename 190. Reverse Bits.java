/* 190. Reverse Bits 

&  if 1 and 1 , return 1 , else , return 0
1 0 0 1 1     
0 1 1 1 1
---------
0 0 0 1 1

|  if (1 or 0)  || (1 and 1) return 1 , else (0 and 0) return 0
1 0 1 1 0
0 1 0 0 0
----------
1 1 1 1 0

Here is the following:
n= 1011 ，res = 0

res <<1，res = 0，
add the last potistion 101[1] , res = 1
1011 >>1 101

res =1, res<<1，res = 10，
add the last potistion 10[1] , res = 11
1011 >>1 10

res =11, res<<1，res = 110，
add the last potistion 1[0] , res = 110
10 >>1 1

res =110, res<<1，res = 1100，
add the last potistion [1] , res = 1101
1>>0 , end 

*/
class Solution{
public int reverseBits(int n) {
    int res = 0;
    int count = 0;
    while (count < 32) {
        res <<= 1;  
        res |= (n & 1); 
        n >>= 1;
        count++;
    }
    return res;
}
}

