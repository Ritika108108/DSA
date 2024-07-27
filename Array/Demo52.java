import java.util.*;
class Demo52{
    public static void Sum1(int arr[],int n){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
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
        Sum1(arr,n);
    }
}
