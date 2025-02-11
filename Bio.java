import java.io.*;
public class Bio {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str=br.readLine();
        char s[]=str.toCharArray();
        int n=10,count=0;
        if(str.length()==n){
            if(Character.isDigit(s[0])){
                for(int i=0;i<n;i++){
                    if(s[i]=='0')
                        count++;
                    if(s[i]=='1')
                        count++;
                }
            }
        
        }
        System.out.println(count);
    }
}
