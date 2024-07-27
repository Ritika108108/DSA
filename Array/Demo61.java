import java.util.*;
class Demo61{
    public static void rowWise(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
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
        rowWise(arr,m,n);
    }
}
