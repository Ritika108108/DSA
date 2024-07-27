import java.util.*;
class Demo59{
    public static void occurence(int arr[],int n,int x){
        System.out.println("Index");
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println(i);
                break;
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
        int x=sc.nextInt();
        occurence(arr,n,x);
    }
}
