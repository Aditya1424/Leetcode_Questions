import java.util.*;
public class spiral_anti_clkwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        SpiralPrint(arr);
        
    }
    public static void SpiralPrint(int [][]arr){
        int minr=0;
        int maxr=arr.length-1;
        int minc = 0;
        int maxc=arr[0].length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        while(c<te){

        for(int i=minr;i<=maxr && c<te;i++){
            System.out.print(arr[i][minc]+" ");
            c++;
        }
        minc++;

        for(int i=minc;i<=maxc && c<te;i++){
            System.out.print(arr[maxr][i]+" ");
            c++;
        }
        maxr--;

        for(int i=maxr;i>=minr && c<te;i--){
            System.out.print(arr[i][maxc]+" ");
            c++;
        }
        maxc--;

        for(int i=maxc;i>=minc && c<te;i--){
            System.out.print(arr[minr][i]+" ");
            c++;
        }
        minr++;
    }
}
    
}
