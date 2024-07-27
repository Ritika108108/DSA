import java.util.*;
class Demo68{
    public static void subArray(int arr[],int n,int k){
        if (k > n) {
            System.out.println("K should be less than or equal to N");
            return;
        }
        int count = n - k + 1;
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter value of K");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr,n,k);
    }
}
