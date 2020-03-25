/*107. Binary Tree Level Order Traversal II

Using Binary First Search (Queue) to search the node level by level
1. Create a Queue call queue
2. Create a List integer call answer
3. error check as usual , if root ==null , return 0
4. add root to queue
5. while queue is not empty
6. create a integer levelNum to store queue size
7. create a list integer call subList
8. for loop,  if i < levelNum , i++
9. create a treenode call curNode , returns and removes the element at the front the container (poll())
10. if curNode is not null  **which is true
11. add curNode.val into subList
12. add curNode.left into queue
13. add curNode.right into queue
14. if subList.size bigger than 0
15. add (0, subList) into answer
16. return answer

*/
 Queue<TreeNode> queue = new LinkedList<TreeNode>();
    List<List<Integer>> ans = new LinkedList<List<Integer>>();
    if (root == null)
        return ans;
    queue.offer(root);
    while (!queue.isEmpty()) {
        int levelNum = queue.size(); 
        List<Integer> subList = new LinkedList<Integer>();
        for (int i = 0; i < levelNum; i++) {
            TreeNode curNode = queue.poll();
            if (curNode != null) {
                subList.add(curNode.val);
                queue.offer(curNode.left);
                queue.offer(curNode.right);
            }
        }
        if (subList.size() > 0) {
            ans.add(0, subList);
        }
    }
    return ans;
}
