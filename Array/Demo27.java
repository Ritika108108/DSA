import java.util.*;
class Demo27{

    public static int prefixSum(int arr[],int n,int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter starting index");
        int l=sc.nextInt();
        System.out.println("Enter ending index");
        int r=sc.nextInt();
        
        prefixSum(arr,n,l,r);
        System.out.println(prefixSum(arr, n, l, r));
        
    }
}
