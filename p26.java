import java.util.*;
public class p26 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enetr three numbers:");
       int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
       System.out.println(Math.abs(x-y)>=20||Math.abs(y-z)>=20||Math.abs(z-x)>=20);
    }
}
