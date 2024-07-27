import java.util.*;
class Demo23{

    public static void swaping(int arr[],int n,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void sorted(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1) {
                if (arr[j] == 0) {
                    swaping(arr,n, i, j);
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorted(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}