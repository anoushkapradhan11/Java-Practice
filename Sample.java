import java.io.*;
public class Sample {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int n=Integer.parseInt(br.readLine());
        System.out.print("Enter the number of times:");
        int r=Integer.parseInt(br.readLine());
        int sumN=0,temp=n,sumR=0;
        while(temp>0){
            int d=temp%10;
            sumN+=d;
            temp/=10;
        }
        int res=sumN*r;
        while(res>0){
            int c=res%10;
            sumR+=c;
            res/=10;
        }
        System.out.println(sumR);


    }
}
