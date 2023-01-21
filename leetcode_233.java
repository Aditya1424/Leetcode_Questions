import java.util.*;
public class leetcode_233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){

        
        
        while(i!=0){
            int rem = i%10;
            if(rem==1){
                c++;
            }
            i=i/10;
        }
        
    }
    System.out.println(c);
    }
}

