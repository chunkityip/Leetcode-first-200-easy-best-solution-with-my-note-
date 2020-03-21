/* 69. Sqrt(x)
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.

It uses binary Search
1. Create a long call start, start =0  //becuase using int will cause integer overflow probelm and long save memory than using double and float
2. Create a long call end , end =x 
3. Create a long call mid, mid = start+ (end-start) /2;
4. while (start < x){
5. if (mid * mid = x){
6. return mid    //we found the sqrt x 
}
7. else if (mid * mid < mid){
8. start = mid;
9.}else{
10. end = mid;
}
11. if (end * end = x){
    return (int)end;
}
12. return (int)start;
*/

class Solution {
    public int mySqrt(int x) {
        long start =0;
        long end = x;
        while(start+1<end){
            long mid = start + (end -start)/2;
            if( mid * mid ==x){
                return (int)mid;
            }else if ( mid * mid < x){
                start = mid;
            }else{
                end = mid;
            }
        }
        if (end * end == x){
            return (int)end;
        }else{
            return (int)start;
        }
    }
}