package com.sujata.demo;

public class DemoClass {

	public static void main(String[] args) {
		String str="Sujata";
//		try{
		int l=str.length();
		System.out.println("Length of String : "+l);
//		}
//		catch(NullPointerException ex){
//			System.out.println("Cannot find legth of null Strings");
//		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
