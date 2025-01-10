public class p2 {
    public static void main(String[] args) {
    int sum=0;
    int n=567;
    while(n!=0){
        sum=sum+(n%10);
        n=n/10;
    }
    System.out.println(sum);
  }
}
