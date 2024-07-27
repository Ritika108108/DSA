import java.util.*;
class Demo67{
    public static void right(int arr[][],int m,int n){
        System.out.println("Right diagonal");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int m=sc.nextInt();
        System.out.println("Enter number of column");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        right(arr,m,n);
    }
}
