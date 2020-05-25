class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /* Our input contains only lower case alphabets, and below arrays will store their count */
        /* a -> index 0, b -> index 1, c -> index 2 .... */
        int ransomArr[] = new int[26]; 
        int magazineArr[] = new int[26];
        /* increment the count of each character occuring the string*/
        for(int i=0; i<ransomNote.length(); i++)
            ransomArr[(int)ransomNote.charAt(i)-97]++;
        for(int i=0; i<magazine.length(); i++)
            magazineArr[(int)magazine.charAt(i)-97]++;
        /* magazine can be constructed from ransomNote iff,
           the count of each character in magazine is >= count of each character in ransomNote */
        for(int i=0; i<26; i++)
            if(ransomArr[i]>magazineArr[i])
                return false;
        
        return true;
    }
}