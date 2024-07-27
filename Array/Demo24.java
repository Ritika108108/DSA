import java.util.*;
class Demo24{

    public static void evenOdd(int arr[], int n){
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
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
        
        evenOdd(arr,n);
        
        System.out.println("Sorted array: ");
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}