import java.util.*;
class Special{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int digit,sum=0;
        while(temp>0){
            int fact=1;
            digit=temp%10;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num)
            System.out.println("Special Number");
        else    
            System.out.println("Not Special Number");
    }
}