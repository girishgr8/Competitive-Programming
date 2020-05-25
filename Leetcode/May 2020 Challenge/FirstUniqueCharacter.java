class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        /* Store the occurence of each character of input string 's' */
        int n = s.length();
        char str[] = s.toCharArray();
        /* Update count of each character */
        for(char ch: str)
            arr[(int)ch-97]+=1;
        /* Iterate over each character of string once again, and check if their occurence value is 1, 
           if found, then return its index, else return -1 after iterating over all characters */
        for(int i=0; i<n; i++)
            if(arr[(int)str[i]-97]==1)
                return i;
        return -1;
    }
}