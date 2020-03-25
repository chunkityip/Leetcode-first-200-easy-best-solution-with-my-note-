/*101. Symmetric Tree 

Check the binary tree is symmetric or not 

1. if (root==null) return true  **cause nothing mean symmetric
2. return isMirror (root.left, root.right)  **cause isSymmetric only have one TreeNode call root,
we need to compare root.left and root.right
3. Create a boolean methiod call isMirror (TreeNode lnode, TreeNode rnode)
4. if lnode ==null && rnode == null return true * cause they both have no sub tree
5. if lnode == null || rnode ==null return false * one subnode only 
6. if lnode.val != rnode.val return false * not only the having subnode, the subnode value also need
to be symmetric.
7. return lnode.val == rnode && isMirror(lnode.left , rinode.left) && isMirror(lnode.right, rnode.right)

The idea are similar to the question 100 by using recursion 
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode lnode, rnode){
        if(lnode ==null && rnode ==null){
            return true;
        }
        if(lnode ==null || rnode ==null){
            return false;
        }
        if(lnode.val != rnode.val){
            return false;
        }
        return lnode.val == rnode && isMirror(lnode.left , rinode.left) && isMirror(lnode.right, rnode.right);
        }
    }

/* Iteration
Using Queue (BFS) to search lnode and rnode level by level
1. Create a Queue call q
3. add root(left) to q
4. add root(right) to q
5. while(!q.isEmpty())   **which mean it will 100% run
6. Create a TreeNode t1 = q.poll();
7. Create a TreeNode t2 = q.poll();
8. if (t1 ==null && t2 ==null) continue  **which mean they are symmetric 
9. if (t1 ==null || t2 ==null) return false **which mean one of the subnode are gone and it is not symmetric 
10.if (t1.val !=t2.val) return false   **same as reursion version, the subnode value also need
to be symmetric.
11. q.add (t1.left)
12.q.add(t2.right)
13. q.add(t1.right)
14. q.add(t2.left)
15. return ture
*/

public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> lnode = new LinkedList<>();
    Queue<TreeNode> rnode = new LinkedList<>();
    lnode.add(root.left);
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode t1 = lnode.poll();
        TreeNode t2 = rnode.poll();
        if (t1 == null && t2 == null) continue;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        lnode.add(t1.left);
        lnode.add(t2.right);
        rnode.add(t1.right);
        rnode.add(t2.left);
    }
    return true;
}
    
