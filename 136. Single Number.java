/* 136. Single Number 

Everyday counting a number character (also any character) can use Hashmap
Becuase the question asking not repeat number , we can use Hashset
when the hastset didn't content one number character , add this character to hastset
if it already content it (which mean it is repeat number), remove it 

1.Create a HastSet call set, 
2. for each loop, for i : nums
3. if (!set.content(nums[i]))
4. add nums[i] to set
5.else
6. remove nums[i] to set 
7. return set.iterator().next();

*/

class Solution{
    public int singleNumber(int[] nums) {
        HashSet <Integer> set = new HashSet <> (); 
        for(int i : nums){
            if(!set.content(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
        }
        return set.iterator().next;
}


/* Another solution is using Bit Manipulation