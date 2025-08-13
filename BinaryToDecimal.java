public class BinaryToDecimal {
   public static void main(String[] args) {
    int num=5;
    int[] array=new int[100];
    while(num>0){
        int index=0;
        int rem=num%2;
        array[index]=rem;
        index++;
        num/=2;
        for(int i=0;i<=array.length;i++){
            System.out.println(array[i]);
        }
    }
   } 
}
