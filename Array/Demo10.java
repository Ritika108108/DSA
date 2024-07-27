import java.util.*;
class Demo10{

    public static int pair(int arr[],int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pair(arr,n,k);
        System.out.println(pair(arr,n,k));
        
    }
}
