import java.util.*;
public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the number: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
       int median=n/2;
       System.out.println("\nMedian:"+arr[median]);


    }
}
