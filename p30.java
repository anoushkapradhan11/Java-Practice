public class p30 {
    public static void main(String[] args) {
        int c=0;
        int n=0;
        int sum=1;
        while(c<100){
            n++;
            if(n%2==0){
                if(isPrime(n)){
                    sum+=n;
                }
            }
            c++;
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        for(int i=3;i*i<=100;i+=2){
            if(n%i==0){
                return false;
            }
           
        }
        return true;

    }

}
