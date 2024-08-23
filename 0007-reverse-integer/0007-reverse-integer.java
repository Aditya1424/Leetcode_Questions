class Solution {
    public static int reverse(int x) {
        long sum=0,lv;

        while(x!=0){
            lv = x%10;
            sum = (sum*10)+lv;
            x = x/10;
        }

    if (sum>=Integer.MIN_VALUE && sum<=Integer.MAX_VALUE){
        return (int)sum;
    }
    else{
        return 0;
    }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(reverse(x));
    }
}