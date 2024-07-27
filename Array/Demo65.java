import java.util.*;
class Demo65{
    public static void sum(int arr[][],int m,int n){
        int sum=0;
        System.out.println("Sum");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
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
        sum(arr,m,n);
    }
}
