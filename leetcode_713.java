public class leetcode_713 {      // subarray product less than K
    public static void main(String[] args) {
        int arr[] = {10,5,2,6};
        int k =100;
        System.out.println(Product(arr, k));
    }
    public static int Product(int[]arr,int k){
        int ans =0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<arr.length){
            p*=arr[ei];
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            ans+=(ei-si+1);
            ei++;
        }
        return ans;
    }
}
