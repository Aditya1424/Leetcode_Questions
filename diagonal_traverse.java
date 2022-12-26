import java.util.*;
public class diagonal_traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
            int ans[]=(diagonal(arr));
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i]+" ");
            }

    }
    public static int[] diagonal(int arr[][]){
        int n=arr.length;
        int m = arr[0].length;
        int [] ans = new int[n*m];
        int i=0;
        for(int d=0;d<n+m-1;d++){
            int r=0;
            int c=0;
            if(d<m){
                r=0;
                c=d;
            }
            else{
                r=d-m+1;
                c=m-1;
            }
            ArrayList<Integer>list = new ArrayList<>();
            while(r<n && c>=0){
                list.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(list);
            }
            for(int val:list){
                ans[i]=val;
                i++;
            }
        }
        return ans;
    }
}

