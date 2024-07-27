import java.util.*;
class Demo7{

    public static void sorted(int arr[],int n){
       boolean ascending=true;
       boolean desending=true;
       for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            ascending=false;
        }
        if(arr[i]<arr[i+1]){
            desending=false;
        }
       }
       if(ascending || desending){
        System.out.println("Sorted");
       }else{
        System.out.println("Not Sorted");
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorted(arr,n);
        
    }
}