import java.util.*;
class Demo28{

    public static void prefixArray(int arr[],int n,int l,int r){
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        int ans=pref[r]-pref[l-1];
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter starting index");
        int l=sc.nextInt();
        System.out.println("Enter ending index");
        int r=sc.nextInt();
        
        
        prefixArray(arr,n,l,r);
        
    }
}
