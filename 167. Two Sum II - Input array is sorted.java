/*167. Two Sum II - Input array is sorted

HashMap
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int currentdata = target - numbers[i];
            if(map.containsKey(currentdata)){
                return new int[] {map.get(currentdata), i+1};
            }
            map.put(numbers[i], i+1);
        }
        return new int[]{0,0};
}
}

// Two Pointer
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length -1;
        while(i<j){
            if(numbers[i]+ numbers[j]==target){
            return new int [] {i+1, j+1};
            }else if (numbers[i]+ numbers[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int [] {-1,-1};
    }
    }
