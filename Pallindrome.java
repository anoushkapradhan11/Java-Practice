import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(temp==rev)
            System.out.println("Pallindrome");
        else
            System.out.println("Not a Pallindrome");
    }
    
}
