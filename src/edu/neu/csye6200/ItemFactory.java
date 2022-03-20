package edu.neu.csye6200;

public class ItemFactory {

	public ItemAPI GetObjectItemAPI(String[] itemSplit) {
		return new ItemAPI((int)ConvertUtility.returnInt(itemSplit[0])
							, ConvertUtility.returnDouble(itemSplit[1]) 
							, itemSplit[2]
							, itemSplit[3]); 
		
	}
	
	public ItemAPI StringCSV(String item) {
		
		String[] itemSplit = item.split(",");
		if(itemSplit.length == 4) {
			return this.GetObjectItemAPI(itemSplit);
		}
		
		if(itemSplit.length == 6) {
			return DurableFactory.getInstance().GetObjectItemAPI(itemSplit);
		}	
		
		if(itemSplit.length == 7) {
			return ServiceFactory.getInstance().GetObjectItemAPI(itemSplit);
		}
		return null;				
	}	
}
