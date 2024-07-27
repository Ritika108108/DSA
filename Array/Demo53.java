import java.util.*;
class Demo53{
    public static void sum2(int[] arr,int n){
        int pref_Arr[]=new int[n];
        pref_Arr[0]=arr[0];
        int maxSum=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            pref_Arr[i]=pref_Arr[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i==0){
                    sum=pref_Arr[j];
                }else{
                    sum=pref_Arr[j]-pref_Arr[i-1];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum2(arr,n);
    }
}