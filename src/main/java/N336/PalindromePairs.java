package N336;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j <= words[i].length(); j++) {

                String left = word.substring(0, j);
                String right = word.substring(j);

                if(isPalindrome(left)) {
                    int pieceIndex = map.getOrDefault(new StringBuilder(right).reverse().toString(), -1);
                    if(pieceIndex != -1 && pieceIndex != i) {
                        result.add(List.of(pieceIndex, i));
                    }
                }

                if (right.length() != 0 && isPalindrome(right)) {
                    int pieceIndex = map.getOrDefault(new StringBuilder(left).reverse().toString(), -1);
                    if(pieceIndex != -1 && pieceIndex != i) {
                        result.add(List.of(i, pieceIndex));
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i <= j) {
            if(word.charAt(i++) != word.charAt(j--)) return false;
        }

        return true;
    }
}
