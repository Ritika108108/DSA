import java.util.*;
class Demo42{
    public static void equilibrium(int arr[],int n){
        int flag=0;
        for(int i=0;i<n;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=0;j<i;j++){
                leftSum=leftSum+arr[j];
            }
            for(int j=i+1;j<n;j++){
                rightSum=rightSum+arr[j];
            }
            if(leftSum==rightSum){
                flag=1;
                System.out.println(i);
                break;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        equilibrium(arr,n);
    }
}
