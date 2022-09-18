package N336;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class PalindromePairsTest {
    private final PalindromePairs palindromePairs = new PalindromePairs();

    @Test
    void test1() {
        var actual = palindromePairs.palindromePairs(new String[] {"abcd","dcba","lls","s","sssll"});
        assertThat(actual).containsExactlyElementsIn(List.of(List.of(1, 0), List.of(0, 1), List.of(3, 2), List.of(2,4)));
    }

    @Test
    void test2() {
        var actual = palindromePairs.palindromePairs(new String[] {"bat","tab","cat"});
        assertThat(actual).containsExactlyElementsIn(List.of(List.of(1, 0), List.of(0, 1)));
    }

    @Test
    void test3() {
        var actual = palindromePairs.palindromePairs(new String[] {"a",""});
        assertThat(actual).containsExactlyElementsIn(List.of(List.of(1, 0), List.of(0, 1)));
    }

    @Test
    void test4() {
        var actual = palindromePairs.palindromePairs(new String[] {"abcd","dcba","lls","s","sssll",""});
        assertThat(actual).containsExactlyElementsIn(List.of(List.of(1, 0), List.of(0, 1),
                List.of(3,2),
                List.of(3,5),
                List.of(5,3),
                List.of(2,4)
        ));
    }

    @Test
    void test5() {
        var actual = palindromePairs.palindromePairs(new String[] {"ab","ba","abc","cba"});
        assertThat(actual).containsExactlyElementsIn(List.of(
                List.of(1, 0),
                List.of(0, 1),
                List.of(2,1),
                List.of(2,3),
                List.of(0,3),
                List.of(3,2)
        ));
    }

}