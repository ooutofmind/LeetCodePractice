package N42;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class TrappingRainWaterTest {
    private final TrappingRainWater instance = new TrappingRainWater();

    @Test
    void test1() {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int actual = instance.trap(height);
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void test2() {
        int[] height = new int[]{4,2,0,3,2,5};
        int actual = instance.trap(height);
        assertThat(actual).isEqualTo(9);
    }

    @Test
    void test3() {
        int[] height = new int[]{5,4,3,2,1,0};
        int actual = instance.trap(height);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void test4() {
        int[] height = new int[]{5,3,4,1,2,0};
        int actual = instance.trap(height);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void test5() {
        int[] height = new int[]{1, 0, 3, 0, 5, 2, 4, 2, 5};
        int actual = instance.trap(height);
        assertThat(actual).isEqualTo(2 + 3 + 7);
    }

}