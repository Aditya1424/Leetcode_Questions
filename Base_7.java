class Solution {
    public String convertToBase7(int num) {
        int sum=0,m=1;
		while (num>0|| num<0) {
			
			int rem = num%7;
			sum = sum+(rem*m);
			num=num/7;
			m = m*10;
		}
		String ans = Integer.toString(sum);
        return ans;
    }
}
