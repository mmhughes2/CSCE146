/*
 * Mackenzie Hughes
 */
public class Cat // step 1. define the class
{
	// Step 2 Data / Instance Variables and Class Constants
	private String name;
	private double weight;
	private int numberOfLegs;
	// Step 3. Constructors
	public Cat () // Default
	{
		this.name = "none";
		this.weight = 1.0;
		this.numberOfLegs = 4;
	}
	public Cat(String aN, double aW, int aL) // Parameterized
	{
		//call mutators
		this.setName(aN);
		this.setWeight(aW);
		this.setNumberOfLegs(aL);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		if(name != null)
		this.name = name;
		else
			this.name = "none";
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) 
	{
		if (weight > 0.0)
		this.weight = weight;
		else 
			this.weight = 1.0;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) 
	{
		if(numberOfLegs >= 0 && numberOfLegs <= 4)
		this.numberOfLegs = numberOfLegs;
		else
			this.numberOfLegs = 4;
	}
	// Step 6
	public String toString()
	{
		return this.name + " " + this.weight + " " + this.numberOfLegs;
	}
	public boolean equals(Cat aC)
	{
		return aC != null &&
				this.name.equals(aC.getName()) &&
				this.weight == aC.getWeight() &&
				this.numberOfLegs.equals(aC.getNumberOfLegs());
	}
}
