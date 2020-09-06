//给定一个二叉树，返回它的 前序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,2,3]
//
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

//        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> resList = new LinkedList<>();
        if (root == null){
            return resList;
        }
        stack.add(root);
        TreeNode tempNode = root;
        while (null != tempNode){
//            TreeNode node = stack.pollLast();
//            tempNode =
            resList.add(tempNode.val);
            if (null != tempNode.right){
                tempNode = tempNode.right;
//                stack.add(node.right);
            }
            if (null != tempNode.left){
//                stack.add(tempNode.left);
                tempNode = tempNode.left;
            }
        }
        return resList;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
