import java.io.*;
public class CatMouse {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the positions of the three:");
        int x=Integer.parseInt(br.readLine());
        int y= Integer.parseInt(br.readLine());
        int z=Integer.parseInt(br.readLine());
        int distA=x-z;
        if(distA<0)
            distA=-(distA);
        int distB=y-z;
            if(distB<0)
                distB=-(distB);
        if(distA>distB)
            System.out.println("CatB");
        else if(distB>distB)
            System.out.println("CatA");
        else if(distA==distB)
            System.out.println("Mouse C");
        else
            System.out.println("loser");
    }
}
