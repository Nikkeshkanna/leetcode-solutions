import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> con=new HashMap<>();
        ArrayList<Integer> word=new ArrayList<>();
        for(int x:arr)
        {
            if(!con.containsKey(x))
            {
                con.put(x,1);
            }else{
                con.put(x,con.get(x)+1);
            }
        }
        for(Integer e:con.values())
        {
            if(word.contains(e)) return false;
            else word.add(e);
        }
        return true;
    }
}