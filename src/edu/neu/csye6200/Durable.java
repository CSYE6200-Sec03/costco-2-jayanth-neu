package edu.neu.csye6200;

public class Durable extends ItemAPI{
	private double weight;
	private String weightUnits;
	{
		weight = 0;
		weightUnits = "Kg";
	}
	
	public Durable(int returnInt, double returnDouble, String string, String string2, double returnDouble2,
			String string3) {
		// TODO Auto-generated constructor stub
		super(returnInt, returnDouble, string, string2);
		this.weight = returnDouble2;
		this.weightUnits = string3;	
	}

	public Durable() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getWeightUnits() {
		return weightUnits;
	}
	public void setWeightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
	}

	@Override
	public String toString() {
		return super.toString() + ", weight=" + getWeight() + ", weightUnits=" + getWeightUnits() ;
	}
}
