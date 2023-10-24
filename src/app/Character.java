package app;

public class Character {
	private static final String CHARACTER_STATS = "Name: %s%n"
			                                    + "Desc: %s%n"
			                                    + "Hit Points: %d%n"
			                                    + "Def: %d%n"
			                                    + "Health: %d%n";
	private String name;
	private String description;
	private int hitPoints;
	private int defensePoints;
	private int health;
	
	public Character() {
		this.name = this.getClass().getSimpleName();
		this.description = "";
		this.hitPoints = 0;
		this.defensePoints = 0;
		this.health = 0;
	}
	
	public Character(String name, String description) {
		this();
		this.name = name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public void displayCharaterStats() {
		System.out.printf(CHARACTER_STATS, this.name, this.description,
				this.hitPoints, this.defensePoints, this.health);
	}
	
	/**
	 * TODO: Implement
	 * @param defender
	 */
	public void attack(Character defender) {
		int damage = 0;
		
		if(this.hitPoints >= defender.getDefensePoints()) {
			damage = this.hitPoints * 2 - defender.getDefensePoints();
		}else {
			damage = this.hitPoints * this.hitPoints / defender.getDefensePoints();
		}
		
		defender.setHealth(defender.getHealth() - damage);
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the defensePoints
	 */
	public int getDefensePoints() {
		return defensePoints;
	}

	/**
	 * @param defensePoints the defensePoints to set
	 */
	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	
	
	
}
