class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,false);
        if(n==0 || n==1)
            return 0;
        arr[0] = true; arr[1] = true;
        for(int i=2; i<(int)Math.ceil(Math.sqrt(n)); i++)
            for(int j=2*i; j<n; j+=i)
                arr[j] = true;
        int count = 0;
        for(int i=0; i<n; i++)   
            if(arr[i]==false)
                count++;
        return count;
    }
}