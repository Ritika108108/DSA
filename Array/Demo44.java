import java.util.*;
class Demo44{
    public static void subArray(int arr[], int n){
        int len=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MAX_VALUE;
        int min_length=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int min_pos=-1;
        int max_pos=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                min_pos=i;
            }
            if(arr[i]!=-1){
                len=min_pos-max_pos+1;
                if(min_length>len){
                    min_length=len;
                }
            }
            if(arr[i]==max){
                max_pos=i;
                if(min_pos!=-1){
                    len=max_pos-min_pos+1;
                    if(min_length>len){
                        min_length=len;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr,n);
    }
}