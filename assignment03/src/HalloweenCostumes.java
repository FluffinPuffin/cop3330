// Chloe Becker
// COP 3330
// 10/6/2024
// Assignment 3

public class HalloweenCostumes implements Comparable <HalloweenCostumes>{
	private String costumeName;
	private double costumeCost;
	private int costumeWant;
	private int coolness;
	
	public HalloweenCostumes(){
		this.costumeName = "Super_Awesome_Costume";
		this.costumeCost = 39.99;
		this.costumeWant = 3;
		this.coolness = 0;
	}
	public HalloweenCostumes(String name){
		this.costumeName = name;
		this.costumeCost = 39.99;
		this.costumeWant = 3;
		this.coolness = 0;
	}
	public HalloweenCostumes(String name, double cost){
		this.costumeName = name;
		this.costumeCost = cost;
		this.costumeWant = 3;
		this.coolness = 0;
	}
	public HalloweenCostumes(String name, int want){
		this.costumeName = name;
		this.costumeCost = 39.99;
		this.costumeWant = want;
		this.coolness = 0;
	}
	public HalloweenCostumes(String name, double cost, int want){
		this.costumeName = name;
		this.costumeCost = cost;
		this.costumeWant = want;
		this.coolness = 0;
	}
	public HalloweenCostumes(double cost){
		this.costumeName = "Super_Awesome_Costume";
		this.costumeCost = cost;
		this.costumeWant = 3;
		this.coolness = 0;
	}
	public HalloweenCostumes(double cost, int want){
		this.costumeName = "Super_Awesome_Costume";
		this.costumeCost = cost;
		this.costumeWant = want;
		this.coolness = 0;
	}
	public HalloweenCostumes(int want){
		this.costumeName = "Super_Awesome_Costume";
		this.costumeCost = 39.99;
		this.costumeWant = want;
		this.coolness = 0;
	}
	
	String getName() {
		return this.costumeName;
	}
	double getCost() {
		return this.costumeCost;
	}
	int getWant() {
		return this.costumeWant;
	}
	int getCoolness() {
		return this.coolness;
	}
	
	public void calcCoolness() {
		double nameLength = this.costumeName.length();
		//System.out.print(nameLength);
		this.coolness = (int) (Math.round((nameLength * this.costumeWant) / this.costumeCost));
	}
	
	@Override
	public int compareTo(HalloweenCostumes o) {
		if (this.coolness - o.coolness > 0) {
			return -1;
		} 
		else if (this.coolness - o.coolness < 0){
			return 1;
		}
		else if (this.coolness - o.coolness == 0) {
			if (this.costumeName.compareTo(o.costumeName) > 0) {
				return 1;
			}
			else if (this.costumeName.compareTo(o.costumeName)< 0) {
				return -1;
			}
		}
		return this.coolness - o.coolness;
	}
}
