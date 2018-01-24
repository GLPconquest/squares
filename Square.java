package squares;

import datas.Bonus;
import datas.Position;
import datas.Resources;
import exceptions.AlreadyMaxLevelException;

public abstract class Square {
	private String type;
	private float moveCost;
	private Bonus bonus;
	private Resources resources;
	private int level;
	private int maxLevel;
	private Position position;
	private int faction; //from 0 to 4, 0 = no faction, other number = possessed by this faction
	private boolean unit; //0 = no unit, 1 = unit from its faction
	
	public Square(String type, float moveCost, Bonus bonus, Resources resources, int level, int maxLevel, Position position,int faction, boolean unit) {
		setType(type);
		setMoveCost(moveCost);
		setBonus(bonus);
		setResources(resources);
		setLevel(level);
		setMaxLevel(maxLevel);
		setPosition(position);
		setFaction(faction);
		setUnit(unit);
	}
	public void levelUp() throws AlreadyMaxLevelException{
		if (getLevel()<maxLevel) {
			setLevel(getLevel()+1);
		}
		else {
			throw new AlreadyMaxLevelException(getPosition());
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getUnit() {
		return unit;
	}
	public void setUnit(boolean unit) {
		this.unit = unit;
	}
	public float getMoveCost() {
		return moveCost;
	}
	public void setMoveCost(float moveCost) {
		this.moveCost = moveCost;
	}
	public Bonus getBonus() {
		return bonus;
	}
	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}
	public Resources getResources() {
		return resources;
	}
	public void setResources(Resources resources) {
		this.resources = resources;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getFaction() {
		return faction;
	}
	public void setFaction(int faction) {
		this.faction = faction;
	}
	
	
}
