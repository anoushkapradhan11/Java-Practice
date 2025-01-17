import java.util.*;
public class p19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the first number:");
        int x=sc.nextInt();
        System.out.println("Input the second number:");
        int y=sc.nextInt();
        System.out.println("Input the third number:");
        int z=sc.nextInt();
        System.out.println("Input a boolean value(true/false):");
        boolean xyz=sc.nextBoolean();
        if(xyz)
            System.out.println(z>y);
        System.out.println(y>x && z>y);
    }
    
}
