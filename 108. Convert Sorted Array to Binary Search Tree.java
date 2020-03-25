/*108. Convert Sorted Array to Binary Search Tree

Looking at the Given the sorted array: [-10,-3,0,5,9]
We can see the left array are smaller, the right array are bigger, which mean I can find the middle one (Dynamic Programming)
int mid (start + end ) >>> 1    ** >>> mean Regardless of whether the positive or negative flag is 0 or 1, 
the binary code of the number is shifted to the right. The left part is always filled with 0 and the right part is discarded.
For example:  1101 ——> 0101

The mean of start + (end - start ) /2 is to avoid overflow , Integer.MAX_VALUE and Integer.MIN_VALUE
When we using >>> , overflow will never happen. 

1: 00000000 00000000 00000000 00000001
+2147483647: 01111111 11111111 11111111 11111111
================================================
-2147483648: 10000000 00000000 00000000 00000000  // Overflow
>>> 1
================================================
+1073741824: 01000000 00000000 00000000 00000000  // Unsigned shift right.

1. as usual , error check, if nums == null or nums.length ==0 , return null
2. we are using recursion , return the helper method (nums, 0 , nums.length-1)
3. Create a TreeNode method call helper(int[]nums, int [] left, int [] right)
4. if (left > right) , return null,  cause we are assume left is smaller than right .
5. Create a integer call mid, mid = (start+end) >>>1
6. Create a TreeNode call current, set current to nums[mid]
7. current.left = helper(nums, left , mid -1)  
8. current.right = helper(nums, mid+1 , right)
9. return current

*/

class Solution{
    public TreeNode sortedArrayToBST(int [] nums){
        if(nums==null || nums.length ==0) return null;

        return helper(nums, 0 , nums.length -1);
    }

    public TreeNode helper(int [] nums, int left int right){
        if (left > right) return null;

        int mid = (left+right) >>> 1;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = helper(nums, left, mid-1);
        current.right = helper(nums, mid+1 , right);
        return current;
    }
}