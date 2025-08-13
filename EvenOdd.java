import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int even=0,odd=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the array element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers:"+even);
        System.out.println("Odd numbers:"+odd);

    }

}
