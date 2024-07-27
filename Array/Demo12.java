import java.util.*;
class Demo12{

    public static int secLar(int arr[],int n){
        Arrays.sort(arr);
        return(arr[n-2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        secLar(arr,n);
        System.out.println(secLar(arr,n));
    }
}