import java.util.*;
class Demo57{
    public static void intArray(int[] arr,int n){
        if(n%2==1 && n>=5){
            for(int i=0;i<n;i++){
                if(arr[i]%2==1){
                    System.out.println(arr[i]);
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    System.out.println(arr[i]);
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
        intArray(arr,n);
    }
}