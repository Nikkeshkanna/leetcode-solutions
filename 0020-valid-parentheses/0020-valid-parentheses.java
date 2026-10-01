class Solution {
    public boolean isValid(String s) 
    {
        int n=s.length();
        if(n%2!=0)return false;
        Stack<Character> opn = new Stack<>();
        char[] arr=s.toCharArray();
        for(char ch:arr)
        {
            if(ch=='{'||ch=='['||ch=='(')
            {
                opn.push(ch);
            }
            else{
                if(opn.isEmpty())
                {
                    return false;
                }
                char top=opn.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
                {
                    return false;
                }
            }
        }
        if(opn.isEmpty())
        {
            return true;
        }else{
            return false;
        }
    }
}