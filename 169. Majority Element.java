/*169. Majority Element

HashMap
*/

class Solution{
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i< nums.length; i++){
            //if nums[i] are not except , create a int call before , else, before will become the value of nums[i]
            int before = map.getOrDefault(nums[i],0);
            // if the process found out the number is n/2, return it 
            if(before == n/2){
                return nums[i];
            }
            //if not, count forward
            map.put(nums[i], before + 1);
        }
        return -1;
}


/* Boyer-Moore Majority Vote Algorithm , very six 
We assume such a scenario, in a game, there are several teams, and the number of one team is more than half. 
All of them have the same combat power. Two people from different teams encounter the same thing. 
Of course, people from the same team do not hurt each other.

In this way, after a sufficient amount of time, the final result is certain, and more than half of the team must be left in the end.

For this problem, we just need to use the above ideas, treat each number of the array as the team number, and then simulate the game process.

group  records the number of people in the current team, and  count  records the number of people remaining in the current team. 
If the remaining number of the current team is 0, record the team number of the person encountered next time
*/ 

public int majorityElement(int[] nums) {
        int count = 1;
        int group = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //when team member are 0, count how many we meet 
            if (count == 0) {
                count = 1;
                group = nums[i];
                continue;
            }
            //when we meet the same team member, +1
            if (nums[i] == group) {
                count++;
            //When we meet others, =1
            } else {
                count--;
            }
        }
        return group;
    }