import java.util.*;
class Demo41{

    public static void countArr(char arr[],int n){
        int pair=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='a'){
                count++;
            }else if(arr[i]=='g'){
                pair=pair+count;
            }
        }
        System.out.println(pair);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);;
        }
        countArr(arr,n);
    }
}