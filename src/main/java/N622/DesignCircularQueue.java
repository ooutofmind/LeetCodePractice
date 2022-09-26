package N622;

public class DesignCircularQueue {

  public static class MyCircularQueue {

    private int[] buffer;
    private int write;
    private int read;
    private int count;

    public MyCircularQueue(int k) {
      write = k - 1;
      read = 0;
      this.buffer = new int[k];
    }

    public boolean enQueue(int value) {
      if (isFull()) {
        return false;
      }

      write = (write + 1) % buffer.length;
      buffer[write] = value;
      count++;

      return true;
    }

    public boolean deQueue() {
      if (isEmpty()) {
        return false;
      }

      buffer[read] = -1;
      read = (read + 1) % buffer.length;
      count--;
      return true;
    }

    public int Front() {
      if (isEmpty()) {
        return -1;
      }
      return buffer[read];
    }

    public int Rear() {
      if (isEmpty()) {
        return -1;
      }
      return buffer[write];
    }

    public boolean isEmpty() {
      return count == 0;
    }

    public boolean isFull() {
      return count == buffer.length;
    }
  }
}


