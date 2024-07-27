import java.util.*;
class Demo21{

    public static int freqArr(int arr[],int n,int x){
        int freArr[]=new int[100000];
        for(int i=0;i<n;i++){
            freArr[arr[i]]++;
        }
        return freArr[x];
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
        int frequency = freqArr(arr, n, x);  
        if (frequency > 0) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
        
    }
}