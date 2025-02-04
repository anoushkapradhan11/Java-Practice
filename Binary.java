import java.io.*;
public class Binary {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a string:");
        String str = br.readLine();
        if(str==null)
            System.out.println("-1");
        else{
            int result=Character.getNumericValue(str.charAt(0));
            int n=str.length();
            int i=1;
            while(i>n){
                char operation=str.charAt(i);
                int operand=Character.getNumericValue(str.charAt(i+1));
                switch(operation){
                    case 'a':
                        result|=operand;
                        break;
                    case 'b':
                        result&=operand;
                        break;
                    case 'c':
                        result^=operand;
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
            }
            System.out.println(result);
        }



    }
    
}
