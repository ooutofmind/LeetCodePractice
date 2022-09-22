package N557;

public class ReverseWordsInAStringIII {

  public String reverseWords(String s) {

    char[] chars = s.toCharArray();
    int start = 0;

    for (int i = 0; i <= chars.length; i++) {
      if(i == chars.length || chars[i] == ' ') {
        int end = i - 1;
        while (start < end) {
          char temp = chars[start];
          chars[start] = chars[end];
          chars[end] = temp;
          start++;
          end--;
        }

        start = i + 1;
      }
    }

    return new String(chars);
  }

}
