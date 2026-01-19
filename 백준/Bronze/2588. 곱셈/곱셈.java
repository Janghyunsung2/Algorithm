import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int numberA = Integer.parseInt(br.readLine());
        int numberB = Integer.parseInt(br.readLine());

        int sum = 0;
        int t = 1;

        for(int i = 0; i < 3; i++){
            int result = numberA * (numberB % 10);
            numberB = numberB / 10;
            System.out.println(result);
            sum += result * t;
            t *= 10;
        }
        System.out.println(sum);
        
        br.close();


    }
}
