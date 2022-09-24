package N113;

import common.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PathSumII {
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> result = new ArrayList<>();
    Deque<Integer> stack = new ArrayDeque<>();
    dfs(root, 0, targetSum, stack, result);
    return result;
  }

  private void dfs(TreeNode node, int curSum, int targetSum, Deque<Integer> path, List<List<Integer>> result) {
    if(node == null) return;

    curSum += node.val;
    path.add(node.val);

    if(node.left == null && node.right == null) {
      if (curSum == targetSum) {
        result.add(new ArrayList<>(path));
      }
    } else {
      dfs(node.left, curSum, targetSum, path, result);
      dfs(node.right, curSum, targetSum, path, result);
    }

    path.removeLast();
  }

}
