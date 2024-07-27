import java.util.*;
class Demo2{
    public static int ele(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ele(arr,n,target);
        System.out.println(ele(arr,n,target));
    }
}
