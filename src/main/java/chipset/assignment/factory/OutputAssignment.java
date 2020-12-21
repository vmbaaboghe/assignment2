package chipset.assignment.factory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OutputAssignment implements Serializable {
	
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 4161150973268760159L;

	private Integer solutionNumber;
	
	private List<List<Integer>> solutions;
	
	private Integer waste;

	/**
	 * @return the solutionNumber
	 */
	public Integer getSolutionNumber() {
		return solutionNumber;
	}

	/**
	 * @param solutionNumber the solutionNumber to set
	 */
	public void setSolutionNumber(Integer solutionNumber) {
		this.solutionNumber = solutionNumber;
	}

	/**
	 * @return the solutions
	 */
	public List<List<Integer>> getSolutions() {
		return solutions;
	}

	/**
	 * @param solutions the solutions to set
	 */
	public void setSolutions(List<List<Integer>> solutions) {
		this.solutions = solutions;
	}

	/**
	 * @return the waste
	 */
	public Integer getWaste() {
		return waste;
	}

	/**
	 * @param waste the waste to set
	 */
	public void setWaste(Integer waste) {
		this.waste = waste;
	}

	@Override
	public String toString() {
		return "OutputAssignment [solutionNumber=" + solutionNumber + ", solutions=" + solutions + ", waste=" + waste
				+ "]";
	}
	
	
	
	
	
}
