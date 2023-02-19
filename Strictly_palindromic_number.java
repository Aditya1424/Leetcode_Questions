class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
             for(int i=2;i<=n-2;i++){
            int sum=0,mul=1;
            while(n>3){
                int rem=n%i;
                sum = sum+(rem*mul);
                mul = mul*10;
                n=n/i;
            }
            if(Pally(sum)){
                return false;
            }
        }
        return false;
            
        
    }
    public static boolean Pally(int n){
        int rev = 0;
        int temp=n;
        while(n>0){
            rev = (rev*10)+n%10;
            n/=10;
        }
        if(n==temp){
            return true;
        }
        return false;
    }
}
