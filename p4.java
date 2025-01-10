import java.util.Scanner;
public class p4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double lat1=sc.nextDouble();
        double long1=sc.nextDouble();
        double lat2=sc.nextDouble();
        double long2=sc.nextDouble();
        lat1=Math.toRadians(lat1);
        long1=Math.toRadians(long1);
        lat2=Math.toRadians(lat2);
        long2=Math.toRadians(long2);
        double earth=6371.01;
        double d=earth*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2));
        System.out.println(d);    
    }
}
