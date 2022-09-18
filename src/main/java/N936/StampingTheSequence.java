package N936;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StampingTheSequence {

    public int[] movesToStamp(String stamp, String target) {

        int stampLength = stamp.length();
        if (target.length() < stampLength) {
            return new int[0];
        }

        char[] targetArr = target.toCharArray();
        char[] initialStr = new char[targetArr.length];
        for (int i = 0; i < target.length(); i++) {
            initialStr[i] = '?';
        }

        List<Integer> turn = new ArrayList<>();
        int pointer = 0;
        int offset = 0;
        boolean hasChar = false;
        boolean hasSolution = false;
        int maxTurns = 10 * target.length();

        while (!Arrays.equals(targetArr, initialStr)) {

            char targetChar = targetArr[pointer + offset];
            char stampChar = stamp.charAt(pointer);
            hasChar |= targetChar != '?';

            if (targetChar == stampChar || targetChar == '?') {
                pointer++;

                if (pointer > stampLength - 1) {
                    if (hasChar) {
                        turn.add(offset);
                        for (int j = offset; j < offset + stampLength; j++) {
                            targetArr[j] = '?';
                        }
                        hasSolution = true;
                    }
                } else {
                    continue;
                }
            }


            if (turn.size() > maxTurns) {
                return new int[0];
            }

            pointer = 0;
            hasChar = false;

            if (offset + stampLength + 1 > target.length()) {
                if (hasSolution) {
                    offset = 0;
                    hasSolution = false;
                } else {
                    return new int[0];
                }
            } else {
                offset++;
            }
        }

        int[] res = new int[turn.size()];
        int k = turn.size() - 1;
        for (int t : turn) {
            res[k--] = t;
        }
        return res;
    }
}
