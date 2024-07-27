import java.util.*;
class Demo38{

    public static void leftmax(int arr[],int n){
        int leftArr[]=new int[n];
        leftArr[0]=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>leftArr[i-1]){
                leftArr[i]=arr[i];
            }else{
                leftArr[i]=leftArr[i-1];
            }
        }
        System.out.println("LeftMax Array");
        for(int i=0;i<n;i++){
            System.out.println(leftArr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leftmax(arr,n);
    }
}
