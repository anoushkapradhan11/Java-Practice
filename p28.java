import java.util.*;
public class p28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(common(a,b));
    }
    public static boolean common(int p,int q){
        if(p<25||q>75){
            return false;
        }
        int x=p%10;
        int y=q%10;
        p/=10;
        q/=10;
        return(p==q||p==y||x==q||x==y);


    }
}
