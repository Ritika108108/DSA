import java.util.*;
class Demo50{
    public static void totalSum(int[] arr,int n){
        int totalSum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                totalSum=totalSum+sum;
            }
        }
        System.out.println(totalSum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        totalSum(arr,n);
    }
}
