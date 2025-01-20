public class p25 {
    public static void main(String[] args) {
        String word="frge";
        word=word.trim();
        String result="";
        char ch[]=word.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            result+=ch[i];
        }
        System.out.println(result.trim());
    }
    
}
