import java.util.*;
class Demo40{
    public static void charArray(char[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]=='a' && arr[j]=='g' && i<j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);;
        }
        charArray(arr,n);
    }
}