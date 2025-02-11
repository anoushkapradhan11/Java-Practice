import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j= 0;j<n;j++){
            int sum=arr[0]+arr[j+1];
            if(sum==x)
                System.err.println("Yes");
            else
                System.out.println("No");
        }
    }
}
