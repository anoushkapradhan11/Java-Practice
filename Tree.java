import java.io.*;
public class Tree{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of test cases:");
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
            System.out.print("The number of cycles:");
            int n=Integer.parseInt(br.readLine());
            int result=utopian(n);
            System.out.println(result);
        }
    
    }
    public static int utopian(int n){
        int h=1;
        for(int i=1;i<=n;i++){  
            if(i%2==0){
                h+=1;
            }
            else{
                h*=2;
            }
        }
        return h;
    }

}

