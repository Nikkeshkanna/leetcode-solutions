import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s)
    {
        HashMap<Character,String> con=new HashMap<>();
        char arr[]=pattern.toCharArray();
        String word[]=s.split(" ");
        if(arr.length != word.length)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!con.containsKey(arr[i]) && !con.containsValue(word[i]))
            {
                con.put(arr[i],word[i]);
            }else{
                if(!word[i].equals(con.get(arr[i])))
                {
                    return false;
                }
            }
        }
        return true;
    }
}