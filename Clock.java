import java.io.*;
public class Clock {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the time:");
        String t=br.readLine();
        String period=t.substring(t.length()-2);
        String time=t.substring(0,t.length()-2);
        String h[]=time.split(":");
        int hh=Integer.parseInt(h[0]);
        int mm=Integer.parseInt(h[1]);
        int ss=Integer.parseInt(h[2]);
        if(period.equals("AM"))
            if(hh==12)
                hh=00;
            else{
                if(hh!=12)  
                hh+=12;
            }
        else 
            hh=12;
        System.out.println(hh+":"+mm+":"+ss);
        
    }
}
