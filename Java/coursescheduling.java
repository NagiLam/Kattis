// Kattis - Course Scheduling
import java.util.*;

public class coursescheduling {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nRequests = Integer.parseInt(in.nextLine());
        Map<String, Set<String>> courseStudentMap = new TreeMap<>();

        for (int i = 0; i < nRequests; i++) {
            String[] inputSplit = in.nextLine().split(" ", 3);
            if (inputSplit.length < 3)
                continue;

            String studentName = inputSplit[0] + " " + inputSplit[1];
            String courseName = inputSplit[2];

            courseStudentMap.computeIfAbsent(courseName, k -> new HashSet<>()).add(studentName);
        }

        courseStudentMap.forEach((course, students) -> System.out.println(course + " " + students.size()));
        in.close();
    }
}
