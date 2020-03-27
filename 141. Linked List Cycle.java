/* 141. Linked List Cycle 

It uses Two pointer
First take a look of this: 

3 -> 2 -> 0 -> -4-
     |            \
      \___________|

It is Circular Linked List which four node liked back to second node

Set a pointer call slow(s), start at first node
Set a pointer call fast(f), start at second node

3 -> 2 ->0 ->4
^    ^
s    f

3 -> 2 -> 0 ->4
     ^    ^
     s    f

3 -> 2 -> 0 ->4
          ^   ^

3 -> 2 -> 0 ->4
     ^        ^

fount it !
*/

class Solution{
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast ==null || fast.next ==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
        }
}