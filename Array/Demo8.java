import java.util.*;
class Demo8{

    public static int count(int arr[], int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
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
        count(arr,n);
        System.out.println(count(arr,n));
        
    }
}