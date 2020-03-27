/* 118 Pascal's Trriangle

Again, we are using dynamic programming

The first node and last node of the row will always return 1
which is if j==0 || j==i

using 2 loops, here is the step: 
i = 2,  j=0,1,2

when j loop to 1

j!=i

last = 2-1 =1
j-1 + j = 1

last + 1 = 2

add 2 to sub
.......
*/




class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList <> ();

        if(numsRows==0) return answer;
        
        for(int i=0; i<numRows; i++){
            List<Integer> sub = new ArrayList<> ();
            
            for (int j=0; j<=i; j++){
                if(j==0 || j==i){
                    sub.add(1);
                }else{
                    List<Integer> last = answer.get(i-1);
                    sub.add(last.get(j-1)+last.get(j));
                }
            }
            answer.add(sub);
        }
        return answer;
    }
}