package N718;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumNumberOfRepeatedSubarrayTest {
  private final MaximumNumberOfRepeatedSubarray instance = new MaximumNumberOfRepeatedSubarray();

  @Test
  void test1() {
    int[] nums1 = new int[]{1, 2, 3, 2, 1};
    int[] nums2 = new int[]{3, 2, 1, 4, 7};

    int res = instance.findLength(nums1, nums2);

    assertThat(res).isEqualTo(3);
  }

  @Test
  void test2() {
    int[] nums1 = new int[]{0,0,0,0,0};
    int[] nums2 = new int[]{0,0,0,0,0};

    int res = instance.findLength(nums1, nums2);

    assertThat(res).isEqualTo(5);
  }

  @Test
  void test3() {
    int[] nums1 = new int[]{0,0,0,0,0,0,1,0,0,0};
    int[] nums2 = new int[]{0,0,0,0,0,0,0,1,0,0};

    int res = instance.findLength(nums1, nums2);

    assertThat(res).isEqualTo(9);
  }

  @Test
  void test4() {
    int[] nums1 = new int[]{0,1,1,1,1};
    int[] nums2 = new int[]{1,0,1,0,1};

    int res = instance.findLength(nums1, nums2);

    assertThat(res).isEqualTo(2);
  }

}