/* Balanced Binary Tree

Also using Dynamic programming to solve the problem 

1. error check , if root is null, return true. * not having right and left, it is balanced
2. Create a integer call leftDepth , leftDepth = getTreeDepth (root.left)
3. Create a integer call rightDepth , leftDepth = getTreeDepth (root.right)
4. if (Math.abs(leftDepth - rightDepth) > 1) return false

*if the heigth of leftDepth and rightDepth  hinger than 1 , which mean not balanced
here is the example:
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4

cause both 4 node (right and left) have no subtree, which is blanace (-1+-1 =0)
left 3 get 1 because it have sublefttree and subrighttree , which is balance , -1 move to 1
right 3 get -1 and when we sum left 3 node (1) - right 3 node (-1), which is 2 . This is not blance
(Math.abs(leftDepth - rightDepth) > 1)

5. return isBalanced(root.left) && isBalanced(root.right);
6. Create a integer call getTreeDepth (TreeNode root). Let set as private
7. if (root == null) return 0
8. Create a integer call leftDepth , leftDepth = getTreeDepth (root.left)
9. Create a integer call rightDepth , leftDepth = getTreeDepth (root.right)
10. return Math.abs(leftDepth - rightDepth + 1

*/
public boolean isBalanced(TreeNode root) {

    if (root == null) {
        return true;
    }

    int leftDepth = getTreeDepth(root.left);
    int rightDepth = getTreeDepth(root.right);
    if (Math.abs(leftDepth - rightDepth) > 1) {
        return false;
    }

    return isBalanced(root.left) && isBalanced(root.right);

}

private int getTreeDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int leftDepth = getTreeDepth(root.left);
    int rightDepth = getTreeDepth(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
}





