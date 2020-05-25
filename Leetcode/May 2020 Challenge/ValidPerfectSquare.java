class Solution {
    public boolean isPerfectSquare(int num) {
        /* 1 is perfect square */
        if(num==1)
            return true;
        /* If number ends in digits 2,3,7,8 then it can never be perfect square */
        if(num%10==2||num%10==3||num%10==7||num%10==8)
            return false;
        
        for(int i=2; i<=i*i; i++){
            if(num%i==0 && i==num/i)
                return true;
        }
        return false;
    }
}