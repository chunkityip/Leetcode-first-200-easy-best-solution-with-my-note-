/* 111. Minimum Depth of Binary Tree

Again, can use recursion or Dynamic Programming 

    3
   / \
  9  20
    /  \
   15   7

1. error check if roont ==null  return 0 ** which we already to the leaf node 
2. if root.left == null , return minDepth(root.right) +1 ** if the left subchild are empty, only care right node +1 
3. opposite of step 2. if root.right ==null , return minDepth(root.left) + 1 
4. return Math.min(minDepth(root.left), minDepth(root.right)) + 1 

Here is the example:
when we goint to the leaf node which are 15 and 7 and 9, return 1 
if both left and right are not null, return the minimum height +1 which is step 4 
    3
   / \
(1)9  20
    /  \
15(1)  7(1) <-

min(1,1) = 1 , 1+1 = 2 , return to 20

      3
     / \
 (1)9  20(2) <-
       /  \
    15(1)  7(1)

min(2,1) = 1 , 1+1 = 2 return to 3


*/
public int minDepth(TreeNode root) {
    if (root == null){
        return 0;
    }    
    if (root.left == null) {
        return minDepth(root.right) + 1;
    }
    if (root.right == null) {
        return minDepth(root.left) + 1;
    } 
    return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
}

/* BFS, which using Queue
1. Create a LinkedList Queue call queue
2. error check, if root is nothing, return 0
3. queue.add(root)  *adding root into queue
4. Create a integer call level , set level as 1
5. while queue is not empty
6. Create a integer call levelNum, levelNum = queue.size()
7. for loop, if i < levelNum, i++
8. Create a treenode call curNode, curNode = queue.poll()
9. if (currNode != null)  * which is correct
10. within if (curNode.left !=null) 
11. adding curNode.left as 15 to queue
12. if (curNode.rgith !=null) 
13.  level ++ 
Here is the following :
levelNum have 15 now which is curNode.left
levelNum have 7 now which is curNode.right , level++
levelNum have 9 now which is curNode.left
levelNum have 20 now which is curNode.right , level++
since 5 !< levelNum which also is 5 , out of loop
level is 2 following
*/
class Solution {
    public int minDepth(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    if (root == null)
        return 0;
    queue.offer(root);
    int level = 1;

    while (!queue.isEmpty()) {
        int levelNum = queue.size(); 
        for (int i = 0; i < levelNum; i++) {
            TreeNode curNode = queue.poll();
            if (curNode != null) {

                if (curNode.left == null && curNode.right == null) {
                    return level;
                }

                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
        }
        level++;
    }
    return level;
}
}



