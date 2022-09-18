package N42;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {
    public int trap(int[] height) {
        //two pointers left is current right goes forward to find next local max
        //if next local max >= left then calc volume else remind max local
        if (height.length < 3) return 0;

        int res = 0;
        int left = 0;
        int right = 1;
        int localMax = 0;
        int localSum = 0;
        Deque<int[]> stack = new ArrayDeque<>();//{height, index, localSum}

        while (right < height.length) {
            localMax = Math.max(localMax, height[right]);

            if(localMax > height[right]) {
                stack.push(new int[]{localMax, right -1, localSum});
                localMax = 0;
            } else {
                localSum += height[right];
            }

            if (height[right] >= height[left]) {
                var vol = 0;
                while (!stack.isEmpty()) {
                    vol += stack.pop()[2];
                }
                res += (right - left - 1) * height[left] - vol;

                left = right;
                localMax = 0;
            }

            right++;

            if(right == height.length && !stack.isEmpty()) {
                var removed = stack.removeLast();
                res += (removed[1] - left - 1) * height[removed[1]] - removed[2];
                left = removed[1];
                right = left + 1;
            }
        }

        return res;

    }
}
