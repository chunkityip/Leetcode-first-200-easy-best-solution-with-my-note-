/*Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

This program have two point: 
1. add 1 to the last number
2. what about the digits is [9] ? or [99] or even [999]? which mean 9+1 is 10.
Because this is array, we need to open spaces to bew diguts which is 10 

Therefore, we should do the following:
1. for loop, i = digits.length -1; if i>=0; i-- 
*cause we are looking for the last number, no need to loop at front
2.  if(digits[i] <9) **which mean the digits is smaller than 9, we don't need
to add a space  {
3.digits[i]++;
4.return digits;
}
5. digits[i] = 0; **which mean digits[i] == 9 }
6. Create a new int resize which will increase digits.length +1;
resize[0] = 1;  **which mean [9]+1 = [10] or [99]+1 = [100]
return resize;
}
*/

class Soluton{
    public int[] plusOne (int [] digits){
        for(int i = digits.length -1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] resize = new int [digits.length +1];
        resize[0]=1;
        return resize;
    }
}
