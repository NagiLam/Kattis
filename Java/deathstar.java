// Kattis - Deathstar
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class deathstar {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int[][] grid = new int[num][num];

        for (int i = 0; i < num; i++) {
            line = in.readLine().split(" ");
            for (int j = 0; j < num; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < num; i++) {
            int calc = 0;
            for (int j = 0; j < num; j++) {
                calc |= grid[i][j];
            }

            System.out.print(calc + " ");
        }

        in.close();
    }
}
