import java.util.*;
class Demo55{
    public static void maxSum(int arr[],int n){
        int sum=0;
        int startIdx=-1;
        int endIdx=-1;
        int x=-1;
        int max=Integer.MIN_VALUE;
        System.out.println("Maximum Subarray:");
        for(int i=0;i<n;i++){
            if(sum==0){
                x=i;
            }
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
                startIdx=x;
                endIdx=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=startIdx;i<=endIdx;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Count"+max);
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