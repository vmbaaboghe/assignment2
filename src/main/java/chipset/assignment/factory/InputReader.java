package chipset.assignment.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class InputReader {

	public static InputAssignment readInputFile(String filePath) {

		InputAssignment assignment = new InputAssignment();

		try {

			int countLine = 0;
			Scanner scanner = new Scanner(new File(filePath));

			while (scanner.hasNextLine()) {

				if (countLine == 0) {
					assignment.setMachineNumber(Integer.parseInt(scanner.nextLine()));
				}

				if (countLine == 1) {
					assignment.setChipsProducedByMachine(processAssignmentByMachine(scanner.nextLine()));
				}

				if (countLine == 2) {
					assignment.setChipsetsProduced(Integer.parseInt(scanner.nextLine()));
				}
				countLine++;

			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return assignment;
	}


	/**
	 * @param nextLine
	 * @return
	 */
	private static List<Integer> processAssignmentByMachine(String nextLine) {


		String[] sourceArray = StringUtils.split(nextLine, " ");
		int[] intArray = Stream.of(sourceArray)
				.mapToInt(Integer::parseInt).toArray();

		List<Integer> chipsByMinutes =  IntStream.of(intArray).boxed().collect(Collectors.toList());

		return chipsByMinutes;
	}



}


