/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        /* Technique :  Binary Search */
        int low = 1, high = n;
        while(low < high){
            int mid = low + (high-low)/2;
            int v = guess(mid);
            if(v==0) return mid;
            /* if return value of API is 1, then pick is on right side */
            else if(v==1) low = mid+1;
            /* if return value of API is -1, then pick is on left side */
            else high=mid-1;
        }
        return low;
    }
}