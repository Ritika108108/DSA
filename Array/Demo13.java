import java.util.*;
class Demo13{

    public static int secLargest(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if (arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        secLargest(arr,n);
        System.out.println(secLargest(arr,n));
    }
}