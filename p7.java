public class p7 {
    public static void main(String args[]){
        String text="Hello,World";
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
