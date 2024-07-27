import java.util.*;
class Demo9{
    public static int countMax(int arr[],int n){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<max){
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
        countMax(arr,n);
        System.out.println(countMax(arr,n));
        
    }
}