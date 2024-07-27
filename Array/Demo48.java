import java.util.*;
class Demo48{
    public static void subSum(int arr[],int n){
        int pref_arr[]=new int[n];
        pref_arr[0]=arr[0];
        for(int i=1;i<n;i++){
            pref_arr[i]=pref_arr[i-1]+arr[i];
        }
        System.out.println("Sum");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i==0){
                    sum=pref_arr[j];
                }else{
                    sum=pref_arr[j]-pref_arr[i-1];
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
        subSum(arr,n);
    }
}
