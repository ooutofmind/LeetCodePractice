package N985;

public class SumOfEvenNumbersAfterTheQueries {

  public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    int[] res = new int[queries.length];

    int sumOfEven = 0;
    for (int num : nums) {
      if (num % 2 == 0) {
        sumOfEven += num;
      }
    }

    for (int i = 0; i < queries.length; i++) {
      var index = queries[i][1];
      var val = queries[i][0];

      int current = nums[index];
      if ((current ^ 1) == current + 1) {
        sumOfEven -= current;
      }

      current = nums[index] += val;

      if ((current ^ 1) == current + 1) {
        sumOfEven += current;
      }

      res[i] = sumOfEven;
    }

    return res;
  }
}
