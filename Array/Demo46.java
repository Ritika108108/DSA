import java.util.*;
class Demo46{
    public static void subArray(int[] arr,int n){
        System.out.println("Subarray");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=j;k<=j;k++){
                    System.out.println(arr[k]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr,n);
    }
}