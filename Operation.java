import java.util.StringTokenizer;
import java.io.*;
public class Operation {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        System.out.print("Enter the value of c:");
        int c = Integer.parseInt(st.nextToken());
        System.out.println("Enter the two numbers:");
        int a = Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        switch(c){
            case 1:{
                System.out.println(a+b);
                break;
            }
            case 2:{
                System.out.println(a-b);
                break;
            }
            case 3:{
                System.out.println(a*b);
                break;
            }
            case 4:
                System.out.println(a/b);
            default:
                System.out.println("Invalid");
        }
    }
    
}
