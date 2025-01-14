import java.util.*;
public class FactorialR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int result=Factorial(n);
        System.out.println("Factorial:"+result);
    }
     static int Factorial(int num){
        if(num==1){
            return 1;
        }
        else{
            return num*Factorial(num-1);
        }
    }
    
}
