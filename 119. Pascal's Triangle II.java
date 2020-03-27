/* 119. Pascal's Triangle II 

1.Create a List<List<Integer>> call currdata 
2. if rowIndex is null  or rowIndex>33and rowIndex.length ==0   return 0 
*where k ≤ 33

3. foor loop, set as i , if i <=rowIndex, i++
4.Create a List call sum , sum = 0 

5.foor loop, set as j, j<=i , j++ 
if(j==0 || j==i)
sum.add(1)

else
6.Create a List call last , last = answer.get(i-1)
7.sum.add(last.get(j-1) + last.get(j))
8.answer.add(sum)
9. retunr answer;

---------------------------------------------------------------
The question asks Could you optimize your algorithm to use only O(k) extra space?
Which mean no extra space to save last node (can't create last and sum)

1. Create a integer call pre, pre =1
2. Create a ArrayList call current
3. add 1 to current
4. for loop, ,set i as 1, if i<= rowIndex, i++
5. another loop, set j as 1 , if j<i, j++
6. Create a integer call temp, temp = current.get(j)
7. current.set(j, pre + current.get(j));
8. pre = temp;
9. current.add(1)
10. return current

Here is the step:
First , add 1 to current
1

Second, do the loop , i is 1 , 1<=33, i++
j is 1 ; 1!<1 , not running j loop 
add another 1 to current
and then return cur 
    1
1       1

Third,  do the loop , i is 2 , 1<=33, i++
j is 1 ; 1<2 , running j loop 
create a integer call temp, temp = cur.get(j) meaning 1 
cur.set(1, 1 + 1), which mean set 2 to 1st potsition in J.
pre = temp , pre unchange, still 1 
and then return current
    1
  1   1
1   2   1    
.........

*/
class Solution{
    public List<Integer>getRow(int rowIndex){
        int pre = 1;
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for(int i=1; i<=rowIndex; i++){
            for(int j=1; j<i; j++){
                int temp = current.get(j);
                current.set(j, pre + current.get(j));
                pre = temp;
            }
            current.add(1);
        }
        return current;
    }
}
