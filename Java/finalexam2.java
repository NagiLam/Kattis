// Kattis - Final Exam
import java.util.*;

public class finalexam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nQuestions = Integer.parseInt(in.nextLine());
        String[] correctAnswers = new String[nQuestions];

        for (int i = 0; i < nQuestions; i++) {
            correctAnswers[i] = in.nextLine();
        }

        String[] hanhAnswers = new String[nQuestions];
        for (int i = 0; i < nQuestions - 1; i++) {
            hanhAnswers[i] = correctAnswers[i + 1];

        }

        int count = 0;
        for (int i = 0; i < hanhAnswers.length; i++) {
            if (hanhAnswers[i] != null) {
                if (hanhAnswers[i].equals(correctAnswers[i])) {
                    count++;
                }
            }
        }

        System.out.println(count);
        in.close();
    }
}
