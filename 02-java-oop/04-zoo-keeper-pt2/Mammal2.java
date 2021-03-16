public class Mammal2 {
	int energyLevel = 100;
	private int defaultEnergyLevel = 0;
	
	public Mammal2(int energyLevel) {
		this.setEnergyLevel(energyLevel);
	}
	
	public Mammal2() {
		this.energyLevel = defaultEnergyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		int energyLevel = this.getEnergyLevel();
		System.out.println(energyLevel);
		return energyLevel;
	}

}
