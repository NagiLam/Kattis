// Kattis - Attendance
import java.util.*;

public class attendance2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> studentNameList = new ArrayList<>();

        int nStudents = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nStudents; i++) {
            String input = in.nextLine();
            if (!input.equals("Present!")) {
                studentNameList.add(input);
            } else {
                studentNameList.removeLast();
            }
        }

        if (studentNameList.isEmpty()) {
            System.out.println("No Absences");
        } else {
            for (String name : studentNameList) {
                System.out.println(name);
            }
        }

        in.close();
    }
}
