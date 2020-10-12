package com.test.file;

public class Main {

	public static void main(String[] args) {
		
Delivery deliveryOne = new Delivery ("3358 Jackson St", "4043495255");
System.out.println(deliveryOne.getAddress()); 
deliveryOne.setAddress("1313 Mockingbird");
System.out.println(deliveryOne.getAddress());
	}

}
