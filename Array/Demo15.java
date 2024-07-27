import java.util.*;
class Demo15{

    public static int sum(int arr[],int n,int x){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter target");
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr,n,x);
        System.out.println(sum(arr, n, x));
        
    }
}