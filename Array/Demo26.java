import java.util.*;
class Demo26{

    public static void array(int arr[],int n){
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        array(arr,n);
        
    }
}
