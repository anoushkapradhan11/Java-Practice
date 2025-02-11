import java.util.*;
public class Rat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rats:");
        int r = sc.nextInt();
        System.out.print("Enter the amount of food a rat can consume:");
        int unit=sc.nextInt();
        System.out.print("Enter the number of houses:");
        int n=sc.nextInt();
        int sum=0,count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the amount of food:");
            arr[i]=sc.nextInt();
            }
        if(arr==null)
            System.out.println("-1"); 
        int food=unit*r; 
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(food>=sum){
                System.out.println(j+1);
            }
            else if(food>sum){
                System.out.println("0");
            }
            else{
                System.out.println("Not enough food");
            }
        }

    }
}
