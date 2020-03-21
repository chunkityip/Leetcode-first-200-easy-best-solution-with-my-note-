/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

We should use Dynamic Programming.

1.Create a integer call maxSoFar = nums[0]
2.Create another integer call maxEnding = nums[0]
3.for loop, i=1, if i < nums.lengthl i++
4.maxEnding = Math.max(maxEning + nums[i], nums[i])
** When maxEnding is comparing , which is maxEnding(-2) + nums[i](1) = -1 , nums[i](1)
maxEnding will become 1 and it will keep the following.....

index  0   1  2   3   4   5   6   7    8
Input:[-2, 1, -3, 4, -1,  2,  1, -5,   4 ]
       -2, 1, -2, 4,  3 , 5  ,6 , 1 ,  5   <--maxEngind

5. maxEnding = Math.max(maxSoFar, maxEnding);
* maxEnding will do the following...
which is bigger (-2, -2)  ->-2
which is bigger (-2,  1)  -> 1
which is bugger (1,  -2)  -> 1
which is bugger (1,   4)  -> 4
which is bugger (4,   3)  -> 4
which is bugger (4,   5)  -> 5
which is bugger (5,   6)  -> 6
which is bugger (6,   1)  -> 6
which is bugger (6,   5)  -> 6

Therefore, the ouput is 6

6. return maxSoFar
*/
class Solution{
    public int maxSubArray(int [] nums){
        int maxSoFar = nums[0];
        int maxEnding = nums[0];

        for (int i=1; i<nums.length; i++) {
            maxEnding = Math.max(maxEning+ nums[i], nums[i]);

            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}