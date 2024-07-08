// Kattis - Takk fyrir mig
import java.util.*;

class takkfyrirmig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numGuess = Integer.parseInt(in.nextLine());

        // First approach: Use only one loop to read and print the name
        for (int i = 0; i < numGuess; i++) {
            String s = in.nextLine();
            System.out.println("Takk " + s);
        }
      
        // Second approach: First, create a String Array then using 1 loop
        // to put the name into the array and 1 loop to print it
        /*
         * String[] nameArr = new String[numGuess];
         * for (int i = 0; i < numGuess; i++) {
         * nameArr[i] = in.nextLine();
         * }
         * 
         * for (String name : nameArr) {
         * System.out.println("Takk " + name);
         * }
         */
    }
}
