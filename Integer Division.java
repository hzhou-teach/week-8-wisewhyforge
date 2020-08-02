/*
Runtime: 2495 ms, faster than 5.02% of Java online submissions for Divide Two Integers.
Memory Usage: 37.6 MB, less than 5.18% of Java online submissions for Divide Two Integers.

Difficulty: 8

Time: 1 hour

This is real SLOW. That aside, I didn't know how the integer limit worked, but once you explained it to me on the last class, I understood how to do it. This was also attempted on June 16th but solved 9on August 2nd, but all in all it took an hour total from both attempts.
*/
class Solution {
    public int divide(int dividend, int divisor) {
        int ans = 0;
        boolean isNegative = false;
        if(divisor == 1){
            return dividend;
        }
        if(dividend == divisor){
            return 1;
        }
        if(dividend < 0 && divisor < 0){
            isNegative = false;
            if(dividend == Integer.MIN_VALUE){
                dividend = Integer.MAX_VALUE;
            }else{
                dividend *= -1;
            }
            if(divisor == Integer.MIN_VALUE){
                return 0;
            }else{
                divisor *= -1;
            }
        }else if(dividend > 0 && divisor > 0){
            isNegative = false;
        }else{
            System.out.println("else");
            isNegative = true;
            if(dividend < 0){
                System.out.println("Before: " + dividend);
                if(dividend == Integer.MIN_VALUE){
                    dividend += divisor;
                    ans++;
                    dividend *=-1;
                }else{
                    dividend = dividend * -1;
                }
                System.out.println(dividend);
            }
            if(divisor < 0){
                if(divisor == Integer.MIN_VALUE){
                    return 0;
                }else{
                    divisor = divisor * -1;
                }
            }
        }
        
        
        System.out.println(dividend + " " + divisor);
        
        int tDividend = dividend;
        while(tDividend >= divisor){
            tDividend -= divisor;
            ans++;
        }
        
        return isNegative ? -ans: ans;
        
    }
}
