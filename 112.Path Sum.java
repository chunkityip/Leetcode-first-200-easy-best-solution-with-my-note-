/* 112 Path Sum

Again, when we talk about binary tree, we always can use recursion

1. as always, check the elements the program want to check is empty or not 
2. if root.left is null and root.left is null and also sum - root.val ==0  return ture
**what is that mean?
once root.left and root.right is null , which mean it is leaf node

sum - root.val ==0 

set sum as 9 
  5
 / \
4   8 

9-5 = 4
4-4 = 0 
done
3. else hasPathSum (root.left, sum - root.val) || hasPathSum (root.right, sum - root.val)
**what is that mean? 
is root.left is not empty && root.right is not empty and sum - root.val !=0 , which mean is not leaf node
keep looking the leaf node 

*/
class Solution{
    public boolean hasPathSum(TreeNode root, int sum){
        if (root==null) {
            return false;
        }

        if (root.left ==null && root.right ==null && sum - root.val ==0){
            return true;
        }else{
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}

/* also we can use DFS(Stack) . When we need to look at each node in Binary Tree, we should use DFS


