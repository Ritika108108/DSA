import java.util.*;
class Demo19{

    public static void swap1(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x "+x);
        System.out.println("y "+y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("x: ");
        int x=sc.nextInt();
        System.out.println("y: ");
        int y=sc.nextInt();
        swap1(x,y);
    }
}