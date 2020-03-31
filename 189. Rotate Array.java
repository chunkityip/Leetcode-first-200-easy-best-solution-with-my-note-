/* 189. Rotate Array 

Four ways to do so
1. Brute Force
The main idea of swap the front and the back 
Create a integer call temp and previous
temp = front, previous = back
previous = temp 

Everytime pointing the last number  to the front
nums = [1,2,3,4,5,6,7]
after swap:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/
class Soultion{
    public void rotate(int [] nums, int k){
        int temp, previous
        for(int i=0; i<l; i++){
            previous = nums[nums.length -1];
            for(int j = 0; j<nums.length; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }            
        }
    }
}

/* Using Extra Array
Here is the step :  k = 3 , nums= [1,2,3,4,5,6,7]
Create a new integer array call a , a.length = nums.length
for loop, if i < nums.length, i++
a[(i+k % nums.length)] = nums[i]  ** 3%7=3 -> a[3] = nums[0]
  
0 1 2 3 4 5 6
a=      1

** 1 + 3 % 7 = 4%7 = 4
a[4] = nums[1]
  
0 1 2 3 4 5 6
a=      1 2

** 2 + 3 % 7 = 5%7 = 5
a[5] = nums[2]

0 1 2 3 4 5 6
a=    1 2 3

** 3+3%7 = 6%7 = 6
a[6] = nums[3]

0 1 2 3 4 5 6
a=    1 2 3 4

** 4+3%7 = 7%7 = 0
a[0] = nums[4]
   0 1 2 3 4 5 6
a= 5     1 2 3 4


** 5 +3 %7 = 8%7 =1
a[1] = nums[5]

   0 1 2 3 4 5 6
a= 5 6   1 2 3 4

** 6+3 % 7 = 9%7 = 2
a[2] = nums[6]

   0 1 2 3 4 5 6
a= 5 6 7 1 2 3 4

After  that , we copy the new array to the original one

*/
class Solution{
    public void reotate (int [] nums. int k){
        int [] a = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            a[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length;i++){
            nums[i] = a[i];
        }
    }
}

/* 3. Using Cyclic Replacements
Thinking of this is cyclic array

 0 1 2 3 4 5 6
-1 2 3 4 5 6 7-
|_____________|

k is the step to moving , if k is 3 , nums[0] move to a[3]
*/
class Solution{
    public void reotate (int [] nums. int k){
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}

/* reverse
Let n=7 and k=3.
Original List                   : 1 2 3 4 5 6 7
After reversing all numbers     : 7 6 5 4 3 2 1
After reversing first k numbers : 5 6 7 4 3 2 1
After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

*/
class Solution{
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


