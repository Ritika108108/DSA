import java.util.*;
class Demo58{
    public static void addition(int arr[],int n){
        System.out.println("Array");
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+5;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        addition(arr,n);
    }
}
