package chipset.assignment.factory;

import java.io.IOException;

public class ChipsetFactory {

	private String filePath = "";

	public static void main(String[] args) throws FunctionalException, IOException {

		System.out.println(" ReadFile ");

		String filePath = "src/main/resources/input.txt";

		InputAssignment input = InputReader.readInputFile(filePath);

		OutputAssignment output = ChipsetProcessor.analyze(input);
		
		System.out.println(output.toString());
		OutputWriter.write(output);

	}
}


