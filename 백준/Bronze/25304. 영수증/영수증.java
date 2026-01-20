import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        int length = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < length; i++) {
            String[] items = br.readLine().split(" ");
            sum += Integer.parseInt(items[0]) * Integer.parseInt(items[1]);
        }

        String result = total == sum ? "Yes" : "No";

        bw.write(result);


        bw.flush();
    }
}
