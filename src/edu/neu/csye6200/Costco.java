package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Costco extends StoreAPI{
	
	private static int demoVariable = 0;
	private final int immutableVariable = 1;
	
	public int getImmutableVariable() {
		return immutableVariable;
	}

	public static int getDemoVariable() {
		return demoVariable;
	}

	public static void setDemoVariable(int demoVariable) {
		Costco.demoVariable = demoVariable;
	}

	public static void demo() {
		
		List<String> itemsString = new ArrayList<>();
		itemsString.add("2,3.49,OJ,Tropicana Oriage Juice");
		itemsString.add("1,2.49,Cheese,Provolone cheese");
		itemsString.add("3,1.49,Milk,Almond Milk");
		itemsString.add("4,0.89,Snack,Mounds chocolate bar");
		itemsString.add("6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg");
		itemsString.add("5,12.49,Chair,folding chair,2.89,Lbs");
		itemsString.add("7,101.49,Mattress,Air Mattress,27.6,kg");
		itemsString.add("8,6.89,Slippers,bath slippers,2.5,oz");
		itemsString.add("9,596.89,Vacation,Tropical Hawaii Vacation Package,3/12/22,3/18/22,dates");
		itemsString.add("10,35.00,Lessons,Guitar Lessons,3:30pm,4:00pm,hours");
	
		List<ItemAPI> items = new ArrayList<>();
		
		ItemFactory newItemFactory = new ItemFactory();
		
		for(String itemString : itemsString)
			items.add(newItemFactory.StringCSV(itemString));
		
		System.out.println("\n\n*******************************************************************************");
		System.out.println("\n\nCostco App Demonstration");
		
		System.out.println("\n\nSort by ID  Ascending - Natural Order\n");
		items.sort(null);
		printItems(items);
		
		System.out.println("\n\nSort by ID  Descending\n");
		items.sort((o1,o2)-> -Integer.compare(o1.getId(), o2.getId()));
		printItems(items);	
		
		System.out.println("\n\nSort by Price Ascending\n");
		items.sort((o1,o2)-> Double.compare(o1.getPrice(), o2.getPrice()));
		printItems(items);
		
		System.out.println("\n\nSort by Price Descending\n");
		items.sort((o1,o2)-> -Double.compare(o1.getPrice(), o2.getPrice()));
		printItems(items);	
		
		System.out.println("\n\nSort by Name Ascending\n");
		items.sort((o1,o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
		printItems(items);	
		
		System.out.println("\n\nSort by Name Descending\n");
		items.sort((o1,o2)-> -o1.getName().compareToIgnoreCase(o2.getName()));
		printItems(items);
		
		System.out.println("\n\nSort by Description Ascending\n");
		items.sort((o1,o2)-> o1.getDescription().compareToIgnoreCase(o2.getDescription()));
		printItems(items);
		
		System.out.println("\n\nSort by Description Descending\n");
		items.sort((o1,o2)-> -o1.getDescription().compareToIgnoreCase(o2.getDescription()));
		printItems(items);		
	}
	
	public static void printItems(List<ItemAPI> items) {
		for(ItemAPI i:items) {
			if(i instanceof Durable) System.out.println((Durable)i);
			else if(i instanceof Service) System.out.println((Service)i);
			else System.out.println(i);	
		}
	}
	
	@Override
	public String toString() {
		return "In Costco class";
	}
	
	public void staticPolyDemo(int a, int b) {
		System.out.println("In staticPolyDemo-1");
	}
	
	public void staticPolyDemo(int a) {
		System.out.println("In staticPolyDemo-2");
	}
}
