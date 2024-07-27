import java.util.*;
class Demo18{
    
    public static void swap(int x, int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("x: ");
        int x=sc.nextInt();
        System.out.println("y: ");
        int y=sc.nextInt();
        swap(x,y);
    }
}
