// Kattis - Vefþjónatjón
import java.util.*;

public class vefthjonatjon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nSevers = Integer.parseInt(in.nextLine());
		int cpu = 0, mem = 0, harddrive = 0, webservers = 0;

		for (int i = 0; i < nSevers; i++) {
			String[] input = in.nextLine().split(" ");
			if (input[0].equals("J")) {
				cpu += 1;
			}

			if (input[1].equals("J")) {
				mem += 1;
			}

			if (input[2].equals("J")) {
				harddrive += 1;
			}

			if (cpu > 0 && mem > 0 && harddrive > 0) {
				webservers += 1;
				cpu--;
				mem--;
				harddrive--;
			}
		}

		System.out.println(webservers);
		in.close();
	}
}
