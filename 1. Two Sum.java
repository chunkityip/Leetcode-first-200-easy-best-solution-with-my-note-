/*1. Two sum

1.Create a Hashmap call map which install 2 integer 
2.for (int i=0; i<nums.length; i++)  {
3. create a integer call currentdata which install the following : target - nums[i] 
(compare is target = nums[i] + nums[i])
4. if map contains the key of currentdata{
5.return new integer {map.get(currentdata) , i} 
}
6. put the nums[i](key) and i (value) into map cause it keep adding the following key 
(because the map is empty (mapn contains nothing, the 3 step  wouln't wokring . The
currentdata must install at least 1 data which is first key)
}

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int currentdata = target - nums[i];
            if(map.containsKey(currentdata)){
                return new int[] {map.get(currentdata), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}