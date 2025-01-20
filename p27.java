import java.util.*;
public class p27 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers:");
       int x=sc.nextInt();
       int y=sc.nextInt();
       System.out.println(result(x,y));
    }
    public static int result(int x,int y) {
        if(x==y){
            return 0;
        }
        if(x%6==y%6){
            return(x<y)?x:y;
        }
        else{
            return (x>y)?x:y ;
        }
    }

    
}
