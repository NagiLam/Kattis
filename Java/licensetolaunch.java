// Kattis - License to Launch
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class licensetolaunch {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		int length = Integer.parseInt(in.readLine());
		String[] input = in.readLine().split(" ");
		int[] sj = new int[length];

		for (int i = 0; i < length; i++) {
			sj[i] = Integer.parseInt(input[i]);
		}

		int smallest = Integer.MAX_VALUE;
		int smallIndex = 0;
		for (int j = 0; j < length; j++) {
			if (sj[j] < smallest) {
				smallest = sj[j];
				smallIndex = j;
			}
		}

		out.write(smallIndex + "");
		out.flush();
		out.close();
		in.close();
	}
}
