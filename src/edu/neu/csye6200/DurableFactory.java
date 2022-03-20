package edu.neu.csye6200;

public class DurableFactory extends ItemFactory{

	   private static DurableFactory instance;
	   
	   private DurableFactory() {
		   instance = null;
	   }
	   
	   public static synchronized DurableFactory getInstance() {
		   if (instance == null) {
			   instance =  new DurableFactory();
		   	}
		   return instance;
	   }
	   
	   public ItemAPI GetObjectItemAPI(String[] itemSplit) {
			ItemAPI item =  new Durable((int)ConvertUtility.returnInt(itemSplit[0])
					, ConvertUtility.returnDouble(itemSplit[1]) 
					, itemSplit[2]
					, itemSplit[3]
					, ConvertUtility.returnDouble(itemSplit[4])
					, itemSplit[5]); 
			return item;
	   } 
	   
	   
}