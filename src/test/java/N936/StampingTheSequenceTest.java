package N936;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class StampingTheSequenceTest {

    @Test
    void targetLessThanStamp() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("abcccc", "a");
        assertThat(result).isEqualTo(new int[0]);
    }

    @Test
    void movesToStamp1() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("abc", "ababc");
        assertThat(result).isEqualTo(new int[]{0, 2});
    }

    @Test
    void movesToStamp2() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("abca", "aabcaca");
        assertThat(result).asList().containsExactlyElementsIn(List.of(3, 0, 1));
    }

    @Test
    void movesToStamp3() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("h", "hhhhhh");
        assertThat(result).asList().containsExactlyElementsIn(List.of(0, 1, 2, 3, 4, 5));
    }

    @Test
    void movesToStamp4() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("vba", "vvbvbavbaa");
        assertThat(result).asList().containsExactlyElementsIn(List.of(0, 1, 7,6,3));
    }

    @Test
    void movesToStamp5() {
        var instance = new StampingTheSequence();
        int[] result = instance.movesToStamp("mda", "mdadddaaaa");
        assertThat(result).isEmpty();
    }
}