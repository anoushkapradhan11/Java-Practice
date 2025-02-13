import java.io.*;
public class Circus{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter  the Data:");
        int x1=Integer.parseInt(br.readLine());
        int v1=Integer.parseInt(br.readLine());
        int x2=Integer.parseInt(br.readLine());
        int v2=Integer.parseInt(br.readLine());
        String result=JumpNumber(x1, v1, v2, x2);
        System.out.println(result);
    }
        public static String JumpNumber(int x1,int v1,int v2,int x2){
            int new1=x1;
            int new2=x2;
            if(v1>=v2)
                return "No";
            while(new1>new2){
                new1=new1+v1;
                new2=new2+v2;
                if(new1==new2)
                    return "Yes";
            }
            return "No";
        }
}