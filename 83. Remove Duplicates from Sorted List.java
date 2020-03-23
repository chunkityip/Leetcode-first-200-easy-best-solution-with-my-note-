/* 83. Remove Duplicates from Sorted List

Very easy question, bascilly compare head is equal to head.next or not 
1. error check, if head is null, return null. Nothing we need to do about
2. Create a new ListNode call currdata, currdata = head;
3. while currdata.next is not null , we can do the following:   
4. comparing if currdata.next.val == currdata.val     *Leetcode gave us int val in ListNode
5. currdata.next = currdata.next.next   ** if the currdata and next node is same, linked to third one ,imgrome the second one
Before: 1 ->  1 -> 2   After:  1   1   2
                               ^      ^
                                \_____/
6. return head


*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null){
           return null;
       }
        ListNode currdata = head;
        while(currdata.next!=null){
            if(currdata.next.val == currdata.val){
                currdata.next = currdata.next.next;
            }else{
                currdata = currdata.next;
            }
        }
        return head;
}
}