import java.util.*;
class Demo33{

    public static void transpose1(int arr1[][],int m1,int n1){
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        System.out.println("Transpose :");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                System.out.println(arr1[j][i]);
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
            transpose1(arr1,m1,n1);
            
        }
}
