/* 160 Intersection of Two Linked Lists

It actually can use HashTable and Two Pointer to do so.

1. Two Pointer:

4 1 8 4 5
^   

5 0 1 8 4 5
^

I was thinking what if one linkedlist length is smaller than another one 
However, here is the solution 
If the length is different, the shorter linked list reaches the end first, and then the pointer turns to the longer linked list. 
At this moment, the longer linked list continues to the end, and the extra distance is just the solution introduced at the beginning. 
The length of the linked list is different. After the completion, the pointer turns to the shorter linked list.

4 1 8 4 5
^
a

5 0 1 8 4 5
  ^
  b

a and b will match

*/
class Solution{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA, pb = headB;
        while(pa!=pb){
            pa = pa != null ? pa.next : headB;
            pb = pb != null ? pb.next : headA; 
        }
        return pa;
}
}

/* HashTable
Same as the two pointer, pa and pd. Create a set call node
add pa into pa and point to pa.next
if node.contain pd (which is pa), return the pd 
else, point to pd.next
return null because it can't found anything.
*/

class Solution{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> node = new HashSet<>();
        ListNode pa = headA;
        while(pa!=null){
            node.add(pa);
            pa = pa.next;
        }
        if(node.isEmpty()) return null; 

        ListNode pb = headB;
        while(pb!=null){
            if (node.contains(pb)){
                return pb;
            }
            pb = pb.next;
        }
        return null;
    }
}


