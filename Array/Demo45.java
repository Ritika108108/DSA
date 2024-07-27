import java.util.*;
class Demo45{
    public static void subarray(int arr[],int n){
        int count=0;
        System.out.println("Subarray");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr,n);
    }
}
