import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int numberA = Integer.parseInt(line[0]);
        int numberB = Integer.parseInt(line[1]) - 45;

        if(numberB < 0){
            numberB += 60;
            numberA--;
        }

        if(numberA < 0){
            numberA += 24;
        }

        System.out.println(numberA + " " + numberB);

    }
}
