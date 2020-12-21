package chipset.assignment.factory;

import java.util.List;

public class InputAssignment {
	
	private Integer machineNumber;
	
	private Integer chipsetsProduced;
	
	private List<Integer> chipsProducedByMachine;

	/**
	 * @return the machineNumber
	 */
	public Integer getMachineNumber() {
		return machineNumber;
	}

	/**
	 * @param machineNumber the machineNumber to set
	 */
	public void setMachineNumber(Integer machineNumber) {
		this.machineNumber = machineNumber;
	}

	/**
	 * @return the chipsetsProduced
	 */
	public Integer getChipsetsProduced() {
		return chipsetsProduced;
	}

	/**
	 * @param chipsetsProduced the chipsetsProduced to set
	 */
	public void setChipsetsProduced(Integer chipsetsProduced) {
		this.chipsetsProduced = chipsetsProduced;
	}

	/**
	 * @return the chipsProducedByMachine
	 */
	public List<Integer> getChipsProducedByMachine() {
		return chipsProducedByMachine;
	}

	/**
	 * @param chipsProducedByMachine the chipsProducedByMachine to set
	 */
	public void setChipsProducedByMachine(List<Integer> chipsProducedByMachine) {
		this.chipsProducedByMachine = chipsProducedByMachine;
	}

	@Override
	public String toString() {
		return "InputAssignment [machineNumber=" + machineNumber + ", chipsetsProduced=" + chipsetsProduced
				+ ", chipsProducedByMachine=" + chipsProducedByMachine + "]";
	}
	
	

}
