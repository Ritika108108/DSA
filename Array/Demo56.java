import java.util.*;
class Demo56{
    public static void square(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*arr[i];
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
        square(arr,n);
    }
}
