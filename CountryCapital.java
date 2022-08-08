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
import java.util.Map.Entry;
public class CountryCapital {
	
	HashMap<String,String> M1 = new HashMap<>(); //Creating and Hashmap M1 to store the values
	
	public CountryCapital() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital); // Hashmap to store the country and capital
		return M1;
	}
	
	public String getCapital(String CountryName) { // method to fetch the capital by passing country
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) { // method to fetch the country by passing capital
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) { //iterating to check and print the country value
			Map.Entry<String, String> enter = it.next();
			
			if (enter.getValue().equals(capitalName))
				return enter.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKey() { //method to swap the values of capital and country by swapping key and value
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) { //iterating to print values
			Map.Entry<String, String> enter = it.next();
			M2.put(enter.getValue(), enter.getKey());

		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() { // To store the values into Arraylist and return the arraylist
		ArrayList<String> arr = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> enter = it.next();
			arr.add(enter.getKey());
		}
		
		return arr;
	}

}