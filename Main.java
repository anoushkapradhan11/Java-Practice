import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        String[] scoreStrings = br.readLine().split(" "); 
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(scoreStrings[i]);
        }
        int max = scores[0], min = scores[0];
        int maxCount = 0, minCount = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxCount++;
            } else if (scores[i] < min) {
                min = scores[i];
                minCount++;
            }
        }
        System.out.println(maxCount + " " + minCount);
    }
}
