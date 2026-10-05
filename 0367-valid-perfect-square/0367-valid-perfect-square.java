class Solution {
    public boolean isPerfectSquare(int num) 
    {
        if(num==1)return true;
        for(int i=1;i<=num/2;i++)
        {
            int sum=i*i;
            if(sum==num)
            {
                return true;
            }
            if(sum > num) break;
        }
        return false;
    }
}