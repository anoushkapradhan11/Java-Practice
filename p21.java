import java.util.*;
public class p21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input seconds");
        int seconds=sc.nextInt();
        int S= seconds %60;
        int H=seconds/60;
        int M=H%60;
        H=H/60;
        System.out.println(H+ ":" +M+ ":"+S);
    }
    
}
