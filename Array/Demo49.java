import java.util.*;
class Demo49{
    public static void sum(int[] arr,int n){
        System.out.println("Sum");
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
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
        sum(arr,n);
    }
}