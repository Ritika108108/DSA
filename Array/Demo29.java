import java.util.*;
class Demo29{

    public static int array(int arr[],int n){
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum=totalSum+arr[i];
        }
        return totalSum;
    }

    public static boolean suffixSum(int arr[],int n){
        int totalSum=array(arr, n);
        int prefix=0;
        for(int i=0;i<n;i++){
            prefix=prefix+arr[i];
        int suffix=totalSum-prefix;
        if(suffix==prefix){
            return true;
        }
    }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        suffixSum(arr,n);
        System.out.println(suffixSum(arr, n));
    }
}
