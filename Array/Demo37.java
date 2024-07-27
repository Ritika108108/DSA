import java.util.*;
class Demo37{
     
    public static void leftMax(int[] arr,int n){
        int leftMaxArr[]=new int[n];
        int max=arr[0];
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
                leftMaxArr[i]=max;
            }
            
        
        for(int i=0;i<n;i++){
            System.out.println(leftMaxArr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leftMax(arr,n);
    }
}