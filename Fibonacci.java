import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,nextNum;
        for(int i=1;i<=n;i++){
            System.out.print(n1+",");
            nextNum=n1+n2;
            n1=n2;
            n2=nextNum;
        }
    }
}
