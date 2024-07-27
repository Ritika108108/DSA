import java.util.*;
class Demo43{
    public static void equilibriumIdx(int arr[],int n){
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1=sum1+arr[i];
        }
        int ans=-1;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1=sum1-arr[i];
            if(sum1==sum2){
                ans=i;
                break;
            }
            sum2=sum2+arr[i];
        }
        if(ans==-1){
            System.out.println("No");
        }else{
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        equilibriumIdx(arr,n);
    }
}
