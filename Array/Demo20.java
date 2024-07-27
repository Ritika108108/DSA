import java.util.*;
class Demo20{

    public static void reverse(int arr[], int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[],int n,int k){
         k=k%n;
         reverse(arr, 0,n-k-1);
         reverse(arr,n-k,n-1);
         reverse(arr,0,n-1);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter number to rotate");
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,n,k);
        System.out.println("Rotated array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}