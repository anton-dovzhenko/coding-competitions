import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by anton on 8/3/17.
 */
public class _71SimplifyPath {

    public String simplifyPath(String path) {
        StringTokenizer tokenizer = new StringTokenizer(path, "/");
        ArrayList<String> pathList = new ArrayList<>(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            switch(token) {
                case "":
                case ".":
                    break;
                case "..":
                    if (!pathList.isEmpty()) {
                        pathList.remove(pathList.size() - 1);
                    }
                    break;
                default:
                    pathList.add(token);
            }
        }
        return "/" + String.join("/", pathList);
    }

}
