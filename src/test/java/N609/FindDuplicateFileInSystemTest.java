package N609;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class FindDuplicateFileInSystemTest {

  private final FindDuplicateFileInSystem instance = new FindDuplicateFileInSystem();

  @Test
  void test1() {
    var paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
    var actual = instance.findDuplicate(paths);

    assertThat(actual).containsExactly(List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"), List.of("root/a/1.txt","root/c/3.txt"));
  }

  @Test
  void test1_v2() {
    var paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
    var actual = instance.findDuplicate_v2(paths);

    assertThat(actual).containsExactly(List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"), List.of("root/a/1.txt","root/c/3.txt"));
  }
}