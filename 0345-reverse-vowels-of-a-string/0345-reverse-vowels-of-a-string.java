import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        StringBuilder word=new StringBuilder();
        Stack<Character> con = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                con.add(c);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                word.append(con.pop());
            }else{
                word.append(c);
            }
        }
        return word.toString();
    }
}