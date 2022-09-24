package N113;

import static com.google.common.truth.Truth.assertThat;

import common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PathSumIITest {

  private final PathSumII instance = new PathSumII();

  @Test
  void test1() {
    TreeNode root = new TreeNode(5,
        new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
        new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
    List<List<Integer>> res = instance.pathSum(root, 22);

    assertThat(res).containsExactly(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(-2,
        null,
        new TreeNode(-3));
    List<List<Integer>> res = instance.pathSum(root, -5);

    assertThat(res).containsExactly(List.of(-2, -3));
  }

}