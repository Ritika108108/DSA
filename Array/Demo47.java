import java.util.*;
class Demo47{
    public static void subArraySum(int arr[],int n){
        System.out.println("Sum:");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
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
        subArraySum(arr,n);
    }
}