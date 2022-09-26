package N622;

import static com.google.common.truth.Truth.assertThat;

import N622.DesignCircularQueue.MyCircularQueue;
import org.junit.jupiter.api.Test;

class DesignCircularQueueTest {

  @Test
  void test1() {
    MyCircularQueue queue = new MyCircularQueue(3);
    assertThat(queue.enQueue(1)).isTrue();
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.enQueue(4)).isFalse();
    assertThat(queue.Rear()).isEqualTo(3);
    assertThat(queue.isFull()).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(4)).isTrue();
    assertThat(queue.Rear()).isEqualTo(4);
  }

  @Test
  void test2() {
    MyCircularQueue queue = new MyCircularQueue(8);
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.enQueue(9)).isTrue();
    assertThat(queue.enQueue(5)).isTrue();
    assertThat(queue.enQueue(0)).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.isEmpty()).isFalse();
    assertThat(queue.isEmpty()).isFalse();
    assertThat(queue.Rear()).isEqualTo(0);
    assertThat(queue.Rear()).isEqualTo(0);
    assertThat(queue.deQueue()).isTrue();
  }

  @Test
  void test3() {
    MyCircularQueue queue = new MyCircularQueue(6);
    assertThat(queue.enQueue(6)).isTrue();
    assertThat(queue.Rear()).isEqualTo(6);
    assertThat(queue.Rear()).isEqualTo(6);
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(5)).isTrue();
    assertThat(queue.Rear()).isEqualTo(5);
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.Front()).isEqualTo(-1);
    assertThat(queue.deQueue()).isFalse();
    assertThat(queue.deQueue()).isFalse();
    assertThat(queue.deQueue()).isFalse();
  }

  @Test
  void test4() {
    /*
    ["MyCircularQueue","enQueue","Rear","Front","deQueue","Front","deQueue","Front","enQueue","enQueue","enQueue","enQueue"]
[[3],[2],[],[],[],[],[],[],[4],[2],[2],[3]]
     */
    MyCircularQueue queue = new MyCircularQueue(3);
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.Rear()).isEqualTo(2);
    assertThat(queue.Front()).isEqualTo(2);
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.Front()).isEqualTo(-1);
    assertThat(queue.deQueue()).isFalse();
    assertThat(queue.Front()).isEqualTo(-1);
    assertThat(queue.enQueue(4)).isTrue();
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.enQueue(3)).isFalse();
  }

  @Test
  void test5() {
    /*
    ["MyCircularQueue","enQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue", "Front"]
[[2],[1],[2],[],[3],[],[3],[],[3],[],[]]
     */
    MyCircularQueue queue = new MyCircularQueue(2);
    assertThat(queue.enQueue(1)).isTrue();
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.Front()).isEqualTo(3);
  }

}