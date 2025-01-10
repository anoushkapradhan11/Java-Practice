import java.util.Scanner;
public class p5 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input a string:");
    char[] letters=sc.next().toCharArray();
    for(int i=letters.length-1;i>=0;i--){
        System.out.println(letters[i]);
        }  
    System.out.println("\n");
    }
}
