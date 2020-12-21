package chipset.assignment.factory;

import java.util.ArrayList;
import java.util.List;


public class ChipsetProcessor {

	public static OutputAssignment analyze(InputAssignment input) throws FunctionalException {


		Integer chipsetsProduced = input.getChipsetsProduced();
		Integer machineNumber = input.getMachineNumber();

		List<Integer> chipsetsByMachine = input.getChipsProducedByMachine();

		if (chipsetsByMachine.size() != machineNumber) {
			throw new FunctionalException("Invalid input data !");
		}

		List<List<Integer>> results = combinationSum(chipsetsByMachine, chipsetsProduced);

		return loadOutputAssignment(results);
	}


	/**
	 * 
	 * @param results
	 * @return
	 */
	private static OutputAssignment loadOutputAssignment(List<List<Integer>> results) {
		OutputAssignment outputAssignment = new OutputAssignment();
		
		outputAssignment.setSolutionNumber(results.size());
		outputAssignment.setWaste(0); 
		outputAssignment.setSolutions(results);
		
		return outputAssignment;
	}


	/***
	 * What we try to retrieve is a combination sum
	 * @param chipsetsByMinute
	 * @param target
	 * @return
	 */
	public static List<List<Integer>> combinationSum(List<Integer> chipsetsByMinute, int target) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		helper(chipsetsByMinute, 0, target, 0, temp, result);
		return result;
	}



	private static void helper(List<Integer> candidates, int start, int target, int sum,
			List<Integer> list, List<List<Integer>> result){
		
		if(sum>target){
			return;
		}

		if(sum==target){
			result.add(new ArrayList<>(list));
			return;
		}

		for(int i=start; i<candidates.size(); i++){

			//We avoid to get same entries in the array. 
			if (!list.contains(candidates.get(i))) {
				list.add(candidates.get(i));
				helper(candidates, i, target, sum+candidates.get(i), list, result);
				list.remove(list.size()-1);
			}
		}
	}
}
