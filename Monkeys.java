import java.io.*;
public class Monkeys{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Number of Monkeys:");
        int n=Integer.parseInt(br.readLine());//20
        System.out.println("Input number of bananas:");
        int m=Integer.parseInt(br.readLine());//12
        System.out.println("Input number of peanuts:");
        int p=Integer.parseInt(br.readLine());//13
        System.out.println("Input  number of eatable bananas:");
        int k=Integer.parseInt(br.readLine());//2
        System.out.println("Input number of eatable peanuts:");
        int j=Integer.parseInt(br.readLine());//3
        int m_e_b =m/k;//12/2=6
        int m_e_p=p/j;//13/3=4
        int m_left=n-(m_e_b+m_e_p);//20-(6+4)=10
        if(m%k!=0||p%j!=0){
            m_left--;
        }
        System.out.println("Number of monkeys left:"+m_left);


    }
}