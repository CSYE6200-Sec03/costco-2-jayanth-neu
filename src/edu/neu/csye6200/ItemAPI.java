package edu.neu.csye6200;

public class ItemAPI implements Comparable<ItemAPI>{
	private int id;
	private double price;
	private String name;
	private String description;
	{
		id = 20;
		price = 2.2;
		name = "Pillow";
		description = "Gel pillow";
	}
	
	public ItemAPI(int returnInt, double returnDouble, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.id = returnInt;
		this.price = returnDouble;
		this.name = string;
		this.description = string2;			
	}
	public ItemAPI() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "id=" + id + ", price=" + price + ", name=" + name + ", description=" + description;
	}
	@Override
	public int compareTo(ItemAPI o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
}
