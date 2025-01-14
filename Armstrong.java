import java.util.*;
public class Armstrong {
    public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int sum=0,digits=0;
    int c=n;
    while(c>0){
        c/=10;
        digits++;
    }
    c=n;
    while(c>0){
        int r=c%10;
        sum=(int)(sum + Math.pow(r,digits));
        c/=10;
    }
    if(sum==n){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not Armstrong");
    }
    }
}
