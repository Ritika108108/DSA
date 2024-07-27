import java.util.*;
class Demo36{
    
        public static void spiral(int arr[][],int r,int c){
            int topRow=0;
            int bottomRow=r-1;
            int leftCol=0;
            int rightCol=c-1;
            int totalEle=0;
            System.out.println("Spiral Order");
            while(totalEle<r*c){
                for(int j=leftCol;j<=rightCol && totalEle<r*c;j++){
                    System.out.println(arr[topRow][j]);
                    totalEle++;
                }
                topRow++;
                for(int i=topRow;i<=bottomRow && totalEle<r*c;i++){
                    System.out.println(arr[i][rightCol]);
                    totalEle++;
                }
                rightCol--;
                for(int j=rightCol;j>=leftCol && totalEle<r*c;j--){
                    System.out.println(arr[bottomRow][j]);
                    totalEle++;
                }
                bottomRow--;
                for(int i=bottomRow;i>=topRow && totalEle<r*c;i--){
                    System.out.println(arr[i][leftCol]);
                    totalEle++;
                }
                leftCol++;
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of row");
            int r=sc.nextInt();
            System.out.println("Enter size of column");
            int c=sc.nextInt();
            int arr[][]=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            
            spiral(arr,r,c);
                
    
        

    }
}