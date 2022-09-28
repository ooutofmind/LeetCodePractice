package N838;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class PushDominoesTest {
  private final PushDominoes instance = new PushDominoes();

  @Test
  void test1() {
    String res = instance.pushDominoes("RR.L");
    assertThat(res).isEqualTo("RR.L");
  }

  @Test
  void test2() {
    String res = instance.pushDominoes(".L.R...LR..L..");
    assertThat(res).isEqualTo("LL.RR.LLRRLL..");
  }

  @Test
  void test3() {
    String res = instance.pushDominoes("..........");
    assertThat(res).isEqualTo("..........");
  }

  @Test
  void test4() {
    String res = instance.pushDominoes("R....");
    assertThat(res).isEqualTo("RRRRR");
  }

  @Test
  void test5() {
    String res = instance.pushDominoes("....L");
    assertThat(res).isEqualTo("LLLLL");
  }

  @Test
  void test6() {
    String res = instance.pushDominoes("R...L");
    assertThat(res).isEqualTo("RR.LL");
  }

  @Test
  void test7() {
    String res = instance.pushDominoes(".L...R.");
    assertThat(res).isEqualTo("LL...RR");
  }

  @Test
  void test8() {
    String res = instance.pushDominoes(".R...R.");
    assertThat(res).isEqualTo(".RRRRRR");
  }

}