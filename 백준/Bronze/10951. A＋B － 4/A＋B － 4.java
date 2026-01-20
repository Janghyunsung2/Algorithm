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
            String line = br.readLine();
            if(line == null){
                break;
            }
            String[] lines = line.split(" ");
            int sum = Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]);
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        
        bw.flush();
    }
}
