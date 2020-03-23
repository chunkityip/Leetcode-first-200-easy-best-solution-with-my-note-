/* 88. Merge Sorted Array

It actually using Marge sort. It bascially using three pointers , i, j ,k.
i point to nums1 last index whom having value
j point to nums2 last index
k point to nums1 last index

1,2,3,0,0,0            2,5,6
    ^     ^                ^
    i     k                j

while nums1[i] > nums2[j], the value k point will be  nums1[i--]
while nums1[i] < nums2[j], the value k point will be  nums2[j--]


if 3> 6 which is not
6 move to pointer k , and then j-- will move to 5 , k-- will move forward. i unchange
1,2,3,0,0,6            2,5
    ^   ^                ^
    i   k                j

if 3>5 which is not 
5 move to pointer k , and then j-- will move to 2 , k-- will move forward. i unchange
1,2,3,0,5,6             2
    ^   ^               ^  
    i   k               j

if 3>2 which is yes
3 move to pointer k , and then i-- will move to 2, k-- will move forward. j unchange
1,2,0,3,5,6         2
  ^ ^               ^  
  i k               j

if 2 > 2 which is no 
2 move to pointer 2 and then j-- will move to nothing , k-- will move forward. i unchange, loop over
1,2,2,3,5,6
^ ^
i k 

Second, if pointer j is bigger than 0
nums1[k--] = nums2[j--]

*/
class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n -1;
        while( i>=0 && j>=0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }
}
}
