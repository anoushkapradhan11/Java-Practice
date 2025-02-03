import java.io.*;
public class Password {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char s[]=str.toCharArray();
        boolean track = true,hasupper=false,hasdisgits=false;
        int n= str.length();
        if(n<4)
            track = false;
        if(Character.isDigit(s[0]))
            track = false;
        else{
            for(char ch:s){
                if(ch==' '|| ch== '/')
                    track =false;
                else if(Character.isDigit(ch))
                    hasdisgits=true;
                else if(Character.isUpperCase(ch))
                    hasupper=true;
            }
        }
        if(hasdisgits&&hasupper&&track){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }

    }
    
}
