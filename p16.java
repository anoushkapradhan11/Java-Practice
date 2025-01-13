public class p16 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.println("\n\nDivided by 3:"+i);
        }
        for(int j=1;j<=100;j++){
            if(j%5==0)
                System.out.println("\n\nDivided by 5:"+j);
        }
        for(int k=1;k<=100;k++){
            if(k%3==0 && k%5==0)
                System.out.print("\n\nDivided by both:"+k);
        }
    System.out.println("\n");
    }
    
}
