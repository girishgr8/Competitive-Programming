class Solution {
    public int numJewelsInStones(String J, String S) {
        /* Store occurence of each character (input contains string with lower & uppercase characters only) */
        int stones[] = new int[52];
        for(int i=0; i<S.length(); i++){
            int t = (int)S.charAt(i);
            /* If ASCII value of character is between 65 and 90 (i.e. letters A-Z), 
               then update their counts at respective index, A -> index 0, B -> index 1, and so on */
            if(t>=65 && t<=90)
                stones[t-65]++;
            /* If ASCII value of character is between 97 and 122 (i.e. letters a-z), 
               then update their counts at respective index, a -> index 26, b -> index 27, and so on */
            else
                stones[t-97+26]++;
        }
        int total = 0;
        /* Get the index for each jewel character, and add their count to total */
        for(int i=0; i<J.length(); i++){
            int t = (int)J.charAt(i);
            if(t>=65 && t<=90)
                total += stones[t-65];
            else
                total += stones[t-97+26];
        }
        return total;
    }
}