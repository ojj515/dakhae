package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class GuGudan {

	public static void main(String[] args) {

		FileWriter out = null;

		int count = 0;

		try {
			out = new FileWriter("myfiles/gugudan.txt");

			for (int i = 2; i <= 9; ++i) {
				for (int j = 1; j <= 9; ++j) {
					out.write(i + "x" + j + "=" + i * j + "\t");
				}
				out.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
