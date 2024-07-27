import java.util.*;
class Demo39{
    public static void rightMax(int[] arr,int n){
        int rightArr[]=new int[n];
        rightArr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>rightArr[i+1]){
                rightArr[i]=arr[i];
            }else{
                rightArr[i]=rightArr[i+1];
            }
        }
        System.out.println("RigthMax Array:");
        for(int i=0;i<n;i++){
            System.out.println(rightArr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rightMax(arr,n);
    }
}
