import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] lines = br.readLine().split(" ");
            int sum = Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]);
            if(sum == 0){
                break;
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        
        bw.flush();
    }
}
