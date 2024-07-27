import java.util.*;
class Demo53{
    public static void sum3(int[] arr,int n){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(maxSum<sum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
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
        sum3(arr,n);
    }
}