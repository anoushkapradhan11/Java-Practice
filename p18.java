import java.util.*;
public class p18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the first number:");
        int n1=sc.nextInt();
        System.out.println("Input the second number:");
        int n2=sc.nextInt();
        System.out.println("Input the third number:");
        int n3=sc.nextInt();
        int result=n1+n2;
        if(result==n3)
            System.out.println("The result is:true");
        else
            System.out.println("THe result is:false");
    }
}
