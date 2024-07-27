import java.util.*;
class Demo22{

    public static int sorting(int arr[],int n,int count){
       
        for(int i=0;i<n;i++){
            if(arr[i]==0){
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
        int count=0;
        count = sorting(arr, n, count);
        for(int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}