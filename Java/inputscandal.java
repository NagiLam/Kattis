// Kattis - Input Scandal
import java.util.*;
import java.io.*;

public class inputscandal {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String line;
        int lineCount = 0;

        while ((line = in.readLine()) != null) {
            lineCount++;
            output.append(line).append("\n");
        }

        System.out.println(lineCount);
        System.out.println(output.toString());
        in.close();
    }
}
