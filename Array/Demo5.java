import java.util.*;
class Demo5{

    public static int lastOccur(int arr[],int n,int target){
        int lastIdx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                lastIdx=i;
            }
        }
        return lastIdx;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        lastOccur(arr,n,target);
        System.out.println(lastOccur(arr,n,target));
    }
}