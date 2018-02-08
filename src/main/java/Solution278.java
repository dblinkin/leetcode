/**
 * Created by zhang on 2017/6/22.
 */
public class Solution278 {

    int badVersion;

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);

            boolean isBad = isBadVersion(middle);

            if (isBad) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;

    }

    public boolean isBadVersion(int version) {
        if (version >= badVersion) {
            return true;
        }
        return false;
    }

    public int getBadVersion() {
        return badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }
}
