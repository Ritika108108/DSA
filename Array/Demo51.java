import java.util.*;
class Demo51{
    public static void maxSum(int[] arr,int n){
        int maxSum=Integer.MIN_VALUE;
        System.out.println("maxSum");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxSum(arr,n);
    }
}