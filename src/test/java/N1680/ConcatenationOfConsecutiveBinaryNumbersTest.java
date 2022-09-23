package N1680;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class ConcatenationOfConsecutiveBinaryNumbersTest {

  private final ConcatenationOfConsecutiveBinaryNumbers instance = new ConcatenationOfConsecutiveBinaryNumbers();

  @Test
  void test1() {
    var res = instance.concatenatedBinary(1);
    assertThat(res).isEqualTo(1);
  }

  @Test
  void test2() {
    var res = instance.concatenatedBinary(3);
    assertThat(res).isEqualTo(27);
  }

  @Test
  void test3() {
    var res = instance.concatenatedBinary(12);
    assertThat(res).isEqualTo(505379714);
  }

  @Test
  void test4() {
    var res = instance.concatenatedBinary(42);
    assertThat(res).isEqualTo(727837408);
  }

}