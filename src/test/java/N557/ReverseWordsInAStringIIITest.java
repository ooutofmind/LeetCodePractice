package N557;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class ReverseWordsInAStringIIITest {
  private final ReverseWordsInAStringIII instance = new ReverseWordsInAStringIII();

  @Test
  void test1() {
    var s = "Let's take LeetCode contest";
    var res = instance.reverseWords(s);

    assertThat(res).isEqualTo("s'teL ekat edoCteeL tsetnoc");
  }

  @Test
  void test2() {
    var s = "God Ding";
    var res = instance.reverseWords(s);

    assertThat(res).isEqualTo("doG gniD");
  }

}