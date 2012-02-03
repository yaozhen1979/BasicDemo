package IoC.demo;

import IoC.factory.BusinessFactory;

public class BusinessDemo {
	
	public static void main(String[] args) throws Exception{
		
		
		BusinessFactory business = BusinessFactory.getInstance();
		business.getBusiness().save();
		
	}
	
}
