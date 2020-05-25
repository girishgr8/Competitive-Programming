/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        /* The problem can be solved using BinarySearch in O(log n) time */
        int left = 1;
        int right = n;
        while (left < right) {
            /* get mid of the array */
            int mid = left + (right - left) / 2;
            /* If the middle element is a bad version, then check if its first by setting right to mid,
               i.e. checking for the left subarray */
            if (isBadVersion(mid))
                right = mid;
            /* If the middle element is not a bad version, then check set the left to mid,
               i.e. check for first bad version in right subarray */
            else 
                left = mid + 1;
        }
        /* left holds the index of first bad version */
        return left;
    }
}