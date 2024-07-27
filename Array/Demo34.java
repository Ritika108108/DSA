import java.util.*;
class Demo34{

    public static void rotate(int arr[][],int m1,int n1){
        int ans[][]=new int[n1][m1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                ans[i][j]=arr[j][i];
            }
        }
       for(int i=0;i<n1;i++){
        int left=0;
        int right=m1-1;
           while(left<right){
                int temp=ans[i][left];
                ans[i][left]=ans[i][right];
                ans[i][right]=temp;
                left++;
                right--;
            }
       }
       System.out.println("Rotate matrix:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.println(ans[i][j]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row");
        int m1=sc.nextInt();
        System.out.println("Enter size of column");
        int n1=sc.nextInt();
        int arr[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            rotate(arr,m1,n1);
            
        }
}
