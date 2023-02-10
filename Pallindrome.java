class Solution {
    public static boolean isPalindrome(int x) {
        int lv,sum=0,temp=x;
        int y = Math.abs(x);
        while(y!=0){
            lv = y%10;
            sum = (sum*10)+lv;
            y=y/10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
