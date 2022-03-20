package edu.neu.csye6200;

public class ServiceFactory extends ItemFactory{
	   
	private static final ServiceFactory instance = new ServiceFactory();
	
	private ServiceFactory() {}
			     
	public static ServiceFactory getInstance() {
		return instance;
	}	

	public ItemAPI GetObjectItemAPI(String[] itemSplit) {
		ItemAPI item =  new Service((int)ConvertUtility.returnInt(itemSplit[0])
				, ConvertUtility.returnDouble(itemSplit[1]) 
				, itemSplit[2]
				, itemSplit[3]
				, itemSplit[4]
				, itemSplit[5]
				, itemSplit[6]); 
		return item;
	}
}
