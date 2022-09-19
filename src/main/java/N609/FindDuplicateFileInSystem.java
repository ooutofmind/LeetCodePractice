package N609;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {

  public List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();

    for(var path : paths) {
      var parts = path.split(" ");

      for (int i = 1; i < parts.length; i++) {
        var fileName = parts[i];
        int beginIndex = fileName.lastIndexOf("(");
        var content = fileName.substring(beginIndex + 1, fileName.length() - 1);
        var duplicates = map.computeIfAbsent(content, (it) -> new ArrayList<>());
        duplicates.add(parts[0] + "/" + fileName.substring(0, beginIndex));
      }
    }

    return map.values().stream()
        .filter(it -> it.size() > 1)
        .toList();
  }
  public List<List<String>> findDuplicate_v2(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();

    for(var path : paths) {
      var sb = new StringBuilder();
      int i = 0;
      while (i < path.length()) {
        var ch = path.charAt(i++);
        if(ch == ' ') break;
        sb.append(ch);
      }
      var root = sb.append("/").toString();

      var fileSb = new StringBuilder();

      while(i <= path.length()) {
        var ch = path.charAt(i);
        var content = "";
        if(ch == '(') {
          i++;

          var contentSb = new StringBuilder();
          while(true) {
            ch = path.charAt(i++);
            if(ch == ')') {
              content = contentSb.toString();
             break;
            }
            contentSb.append(ch);
          }
        }

        if(i == path.length() || path.charAt(i) == ' ') {
          var duplicates = map.computeIfAbsent(content, (it) -> new ArrayList<>());
          duplicates.add(root + fileSb);
          fileSb = new StringBuilder();
        } else {
          fileSb.append(ch);
        }

        i++;
      }
    }

    return map.values().stream()
        .filter(it -> it.size() > 1)
        .toList();
  }

}
