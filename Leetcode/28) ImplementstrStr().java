class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(needle.length()>haystack.length())
            return -1;
        int i = 0, j = 0, start = -1, end = -1;
        while(i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(start==-1)
                    start = i;
                i++; j++;
            }
            else{
                start = -1;
                i = i-j;
                j = 0;
                i++;
            }
        }
        if(j<needle.length())
            return -1;
        return start;
    }
}