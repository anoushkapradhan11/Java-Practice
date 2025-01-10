import java.nio.charset.Charset;
public class p9 {
    public static void main(String args[]){
        for(String str: Charset.availableCharsets().keySet() ){
            System.out.println(str);
        }
    }
}
