package chipset.assignment.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OutputWriter {

	public static void write(OutputAssignment output) throws IOException {


		FileWriter fileWriter = new FileWriter("src/main/resources/output.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("Number of solution : "+output.getSolutionNumber());
		printWriter.print("\n");
		for(List<Integer> solution : output.getSolutions()) {
			printWriter.write(solution.toString());printWriter.print("\n");
		}
		printWriter.printf("Waste : 0");
		printWriter.close();
	}

}
