package N985;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class SumOfEvenNumbersAfterTheQueriesTest {

  private final SumOfEvenNumbersAfterTheQueries instance = new SumOfEvenNumbersAfterTheQueries();

  @Test
  void test1() {
    var nums = new int[]{1, 2, 3, 4};
    var queries = new int[][]{new int[]{1, 0}, new int[]{-3, 1}, new int[]{-4, 0}, new int[]{2, 3}};

    int[] res = instance.sumEvenAfterQueries(nums, queries);

    assertThat(res).asList().containsExactly(8, 6, 2, 4);
  }

  @Test
  void test2() {
    var nums = new int[]{1};
    var queries = new int[][]{new int[]{4, 0}};

    int[] res = instance.sumEvenAfterQueries(nums, queries);

    assertThat(res).asList().containsExactly(0);
  }

  @Test
  void test3() {
    var nums = new int[]{1};
    var queries = new int[][]{new int[]{4, 0}, new int[]{1, 0}};

    int[] res = instance.sumEvenAfterQueries(nums, queries);

    assertThat(res).asList().containsExactly(0, 6);
  }

}