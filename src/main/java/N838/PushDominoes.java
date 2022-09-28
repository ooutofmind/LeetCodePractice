package N838;

public class PushDominoes {

  public String pushDominoes(String dominoes) {
    char[] leftD = dominoes.toCharArray();
    char[] rightD = dominoes.toCharArray();
    int n = dominoes.length();
    char[] res = new char[n];


    for (int i = 0; i < n; i++) {
      if(i - 1 >=0 && rightD[i-1] == 'R' && rightD[i] == '.') {
        rightD[i] = 'R';
      }
    }

    for (int i = n - 1; i >= 0; i--) {
      if(i + 1 < n && leftD[i+1] == 'L' && leftD[i] == '.') {
        leftD[i] = 'L';
      }
    }

    int counter = 0;
    for (int i = 0; i < n; i++) {
      char l = leftD[i];
      char r = rightD[i];

      if(l == 'L' && r == 'R') {
        counter++;
        res[i] = 'R';
      } else {
        if(counter > 0) {
          int rem = counter % 2;
          counter /= 2;
          res[i - counter - rem] = '.';
          while (counter > 0) {
            res[i - counter--] = 'L';
          }
        }

        if(l == '.' && r == '.') {
          res[i] = '.';
        } else if(l == '.') {
          res[i] = r;
        } else if (r == '.') {
          res[i] = l;
        } else if(l == r) {
          res[i] = l;
        }
      }

    }

    return new String(res);
  }

}
