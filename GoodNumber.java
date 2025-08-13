import java.util.*;
public class GoodNumber{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int temp,sum=0;
        int num=sc.nextInt();
        temp=num;
        while(temp>0){
            int d= temp%10;
            sum =sum+d;
            temp/=10;
        }
        if(num% sum==0)
            System.out.println("Good Number");
        else
            System.out.println("Not Good Number");
    }
}
