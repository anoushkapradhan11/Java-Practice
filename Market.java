import java.io.*;
public class Market {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the parent name:");
        String p=br.readLine();
        String Yes_no=br.readLine();
        if(Yes_no.equals("Y")){
            System.out.printf("Enter children name:");
            String c=br.readLine();
            String child[]=c.split(",");
            int members=child.length+1;
            int commission=500*child.length;
            System.out.println("Total members:"+members);
            System.out.println("Commission Details:"+p+":"+commission);
            for(String ch:child){
                System.out.println("Children Commision:250 INR");
            }
        }

        else if(Yes_no.equals("N")){
            System.out.print("Total Member=1");
            System.out.println("Commission Details:"+p+"250 INR");
        }
        else
            System.out.println("Invalid");
    }
}
