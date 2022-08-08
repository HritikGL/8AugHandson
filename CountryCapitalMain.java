/*1)

1. Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).

Key- Country Value - Capital

India Delhi

Japan Tokyo

2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.

3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.

4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.

Key – Capital Value – Country

Delhi India

Tokyo Japan

5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.*/

import java.util.*;
public class CountryCapitalMain {

	public static void main(String[] args) {

		CountryCapital cc = new CountryCapital(); // object creation of the CountryCapital class
		
		cc.saveCountryCapital("India", "Delhi");//storing the values
		cc.saveCountryCapital("France", "Paris");
		cc.saveCountryCapital("Sri Lanka", "Colombo");
		cc.saveCountryCapital("Bangladesh", "Dhaka");
		cc.saveCountryCapital("Nepal", "Kathmandu");
		
		System.out.println(cc.getCapital("Nepal"));//calling the getCapital method
		
		System.out.println(cc.getCountry("Dhaka"));//calling the getCountry method
		
		System.out.println(cc.toArrayList());//calling the toArrayList method to store & print values
		
		HashMap<String, String> swap = cc.swapKey();//to swap the key and value of input
		System.out.println(swap);//printing the swapped values

	}

}
