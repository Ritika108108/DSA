import java.util.*;
class Demo1{
    public static int max(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max(arr,n);
        System.out.println(max(arr,n));
    }
}