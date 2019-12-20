
package com.techelevator.StringSortKata;

public class StringReader {

	public String orderString(String string) {
		
		String[] inputArray = string.split(" ");
		String[] outputArray = new String[inputArray.length];
		String result = "";
		
		if (string.equals("")) {
			return "";			
		}
		
		for (int i = 0; i < inputArray.length; ++i) {
			
			for (Integer j = 1; j < 10; ++j){
				
				if (inputArray[i].contains(j.toString())) {
					outputArray[j-1] = inputArray[i];
				}
				
			}
			
		}
		
		for (String word : outputArray) {
			result = result + word + " ";
		}
		
		return result.trim();
	}

}