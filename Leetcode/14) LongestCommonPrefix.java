class Solution {
public String longestCommonPrefix(String[] strs)
{
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++)
        {
           prefix =  getCommonPrefix(strs[i],prefix);
           if(prefix.length() == 0) break;      
        }
        return prefix;
}
    
    public String getCommonPrefix(String input,String prefix) 
	{
        int minLength = Math.min(input.length(),prefix.length());
        int i = 0;
        while(i < minLength && input.charAt(i) == prefix.charAt(i))
        {
            i++;
        }
        return prefix.substring(0,i);
    }
}