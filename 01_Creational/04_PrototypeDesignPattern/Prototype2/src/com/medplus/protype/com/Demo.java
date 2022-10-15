package com.medplus.protype.com;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
     
		BookShop bs = new BookShop() ;
		bs.setShopname("Medplus");
		bs.loadData();  //fetching
		

		//cloning the object from clone emthod
		BookShop bs1 = bs.clone();
		bs.getBooks().remove(1);
		bs1.setShopname("random");
		
		
		System.out.println(bs);
		System.out.println(bs1);
		
		
		
	}

}
