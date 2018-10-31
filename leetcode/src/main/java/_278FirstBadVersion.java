/**
 * Created by anton on 3/4/17.
 */
public class _278FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    protected int firstBadVersion(int start, int end) {
        if (start + 1 >= end) {
            return isBadVersion(start) ? start : end;
        }
        int lookup = start + (end - start) / 2;
        boolean badVersionLookup = isBadVersion(lookup);
        if (badVersionLookup) {
            return firstBadVersion(start, lookup);
        } else {
            return firstBadVersion(lookup, end);
        }
    }

}

class VersionControl {

    boolean isBadVersion(int version) {
        return version > 4;
    }

}
