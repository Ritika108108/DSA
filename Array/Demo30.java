import java.util.*;
class Demo30{

    public static void add(int arr1[][],int m1,int n1,int arr2[][],int m2,int n2){
        int sum[][]=new int[m1][n1];
        if(m1!=m2 || n1!=n2){
            System.out.println("Wrong input");
        }else{
            for(int i=0;i<m1;i++){
                for(int j=0;j<n1;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        }
        System.out.println("Sum:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                System.out.println(sum[i][j]);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row");
        int m1=sc.nextInt();
        System.out.println("Enter size of column");
        int n1=sc.nextInt();
        int arr1[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second array");
        int m2=sc.nextInt();
        System.out.println("Enter size of column");
        int n2=sc.nextInt();
        int arr2[][]=new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
            add(arr1,m1,n1,arr2,m2,n2);
            
        }
        
}

