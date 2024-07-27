import java.util.*;
class Demo4{
    public static int occur(int arr[],int n,int target){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        occur(arr,n,target);
        System.out.println(occur(arr,n,target));
    }
}