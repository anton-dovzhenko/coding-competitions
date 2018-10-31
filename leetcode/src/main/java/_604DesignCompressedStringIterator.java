/**
 * Created by anton on 12/6/17.
 */
public class _604DesignCompressedStringIterator {

    private final String compressedString;
    private int index = -2;
    private int count = 0;
    private int digitCount = 1;

    public _604DesignCompressedStringIterator(String compressedString) {
        this.compressedString = compressedString;
        initNextIndexAndCount();
    }

    private void initNextIndexAndCount() {
        if (count > 0) {
            count--;
        }
        if (count > 0) {
            return;
        }
        index += digitCount + 1;
        int countEndIndex = index;
        for (int i = index + 1; i < compressedString.length(); i++) {
            char c = compressedString.charAt(i);
            if (c >= '0' && c <= '9') {
                countEndIndex = i;
            } else {
                break;
            }
        }
        if (countEndIndex > index) {
            count = Integer.parseInt(compressedString.substring(index + 1, countEndIndex + 1));
            digitCount = countEndIndex - index;
        } else {
            count = -1;
        }
    }

    public char next() {
        if (hasNext()) {
            char c = compressedString.charAt(index);
            initNextIndexAndCount();
            return c;
        }
        return ' ';
    }

    public boolean hasNext() {
        return count != -1;
    }

}
