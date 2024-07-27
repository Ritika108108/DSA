import java.util.*;
class Demo64{
    public static void colWiseSum(int arr[][],int m,int n){
        System.out.println("Sum");
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+arr[j][i];
            }
            System.out.println(sum);
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
        colWiseSum(arr,m,n);
    }
}
