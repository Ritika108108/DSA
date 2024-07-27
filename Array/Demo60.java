import java.util.*;
class Demo60{
    public static void occurence(int arr[],int n){
        System.out.println("Array");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
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
        occurence(arr,n);
    }
}
