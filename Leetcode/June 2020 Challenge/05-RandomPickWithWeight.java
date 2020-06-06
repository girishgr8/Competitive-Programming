class Solution {
    int[] prefixSum;
    Random random;
    int n;
    public Solution(int[] w) {
        random = new Random();
        n = w.length;
        prefixSum = new int[n];
        prefixSum[0] = w[0];
        for(int i=1; i<n; i++)
            prefixSum[i] = prefixSum[i-1] + w[i];
    }
    
    public int pickIndex() {
        int sum = prefixSum[n-1];
        int randInt = random.nextInt(sum);
        int low = 0, high = n-1;
        while (low < high-1) {
            int mid = low + (high-low)/2;
            if (randInt >= prefixSum[mid]) low = mid;
            else high = mid;
        }
        if (randInt < prefixSum[low]) return low;
        return high;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */