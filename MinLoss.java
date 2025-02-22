import java.util.*;
public class MinLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.println("Enter the prices:");
        for(int i=0;i<n;i++){
        price[i]=sc.nextInt();
        }
        int result=minimumLoss(n, price);
        System.out.println("Mimimum Loss:"+result);
    }
    public static int minimumLoss(int n,int price[]){
        int min=0;
        for (int j=0;j<n;j++){
            if(n<4)
                min=price[0]-price[n-1];
            else
                min=price[1]-price[n-1];
        }
        return min;
    }
}
    
