import java.util.*;
class Demo25{
    public static void prefix(int arr[],int n){
        int prefArr[]=new int[n];
        prefArr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefArr[i]=prefArr[i-1]+arr[i];
        }
        System.out.println("Prefix array: ");
        
        for(int i=0;i<n;i++){
            System.out.print(prefArr[i]+" ");
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
        
        prefix(arr,n);
        
    }
        
}
