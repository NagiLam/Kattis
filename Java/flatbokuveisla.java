import java.util.*;

class flatbokuveisla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSlices = in.nextInt();
        int numResident = in.nextInt();
        in.close();

        System.out.println(numSlices % numResident);
    }
}
