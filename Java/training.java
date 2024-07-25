// Kattis - Training
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class training {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int skill = Integer.parseInt(line[1]);

        for (int i = 0; i < num; i++) {
            line = in.readLine().split(" ");
            int lower = Integer.parseInt(line[0]);
            int upper = Integer.parseInt(line[1]);

            if (lower <= skill && skill <= upper) {
                skill++;
            }
        }

        System.out.println(skill);
        in.close();
    }
}
