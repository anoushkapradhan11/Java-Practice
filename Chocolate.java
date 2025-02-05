import java.io.*;
public class Chocolate {
    public static void main(String[] args)throws IOException {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the number of chocolates:");
      int c= Integer.parseInt(br.readLine());
      System.out.print("Enter the number of wrappers:");
      int w= Integer.parseInt(br.readLine());
      int d=0;
      while(c>0){
        d+=c;
        w+=c;
        c=0;
        if(w>=7){
            c=w%7;
            w/=7;
        }
      }
      System.out.print("Number of days:"+d);
    }
}
