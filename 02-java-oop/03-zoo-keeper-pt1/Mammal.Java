public class Mammal {
	int energyLevel = 100;
	private int defaultEnergyLevel = 0;
	
	public Mammal(int energyLevel) {
		this.setEnergyLevel(energyLevel);
	}
	
	public Mammal() {
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
