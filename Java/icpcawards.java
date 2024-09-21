// Kattis - ICPC Awards
import java.util.*;

public class icpcawards {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTeams = Integer.parseInt(in.nextLine());
        List<String> resultList = new ArrayList<>();
        List<String> winnerList = new ArrayList<>();

        for (int i = 0; i < nTeams; i++) {
            String[] input = in.nextLine().split(" ");
            String uniName = input[0];
            String teamName = input[1];

            if (!resultList.contains(uniName) && winnerList.size() < 12) {
                resultList.add(uniName);
                winnerList.add(uniName + " " + teamName);
            }
        }

        for (String string : winnerList) {
            System.out.println(string);
        }
      
        in.close();
    }
}
