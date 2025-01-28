import java.util.*;
public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String");
        String line = sc.next();
        String upper="";
        Scanner lineScan=new Scanner(line);
        while(lineScan.hasNext()){
            String word=lineScan.next();
            upper+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(upper.trim());
    }
}