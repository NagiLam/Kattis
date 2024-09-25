// Kattis - Mjehuric
import java.io.*;
import java.util.*;

public class mjehuric {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        int[] arr = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int index = 0;
        boolean done = false;
        while (!done) {
            done = true;
            for (int a = 0; a < arr.length - 1; a++) {
                if (arr[a] > arr[a + 1]) {
                    int t = arr[a];
                    arr[a] = arr[a + 1];
                    arr[a + 1] = t;
                    for (int q = 0; q < arr.length; q++) {
                        System.out.print(arr[q] + " ");
                    }
                    System.out.println();
                    done = false;
                }
            }
            index++;
        }
      
        in.close();
    }
}
