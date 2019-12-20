import java.util.ArrayList;
import java.util.List;

public class SimpleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn = "123 456 789 X";
		boolean validISBN = false;
		String checkString = "";
		int listSum = 0;
		List<Integer> numList = new ArrayList<>();

		// String falseChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYZ";
		// String falseSpecChars = "`~!@#$%^&*()_=+[{]}|<,>.?/\"
		// check for false chars
		// for (int i = 0; i < isbn.length(); i++) {
		// for (int j = 0; j < falseChars.length(); j++)
		// if (isbn.charAt(i) == (falseChars.charAt(j))) {
		// return false;
		// }
		// }
		// if (isbn.substring(0, isbn.length-1).contains("X")) {
		// return false;
		// }
		// check for false special chars
		// for (int i = 0; i < isbn.length(); i++) {
		// for (int j = 0; j < falseSpecChars.length(); j++)
		// if (isbn.charAt(i) == (falseSpecChars.charAt(j))) {
		// return false;
		// }
		// }
		// if (isbn.substring(0, isbn.length-1).contains("X")) {
		// return false;
		// }
		
		// remove special chars from isbn String
		if (isbn.contains(" ")) {
			String[] inputArray = isbn.split(" ");
			for (String number: inputArray) {
				checkString += number;
			}
		} else if (isbn.contains("-")) {
			String[] inputArray = isbn.split("-");
			for (String number: inputArray) {
				checkString += number;
			}
		} else {
			checkString = isbn;
		}
		

		// capture string w/ or w/out "X" to compare later
		String checkISBN = checkString;
		
		// capture string w/out check digit for parse & calc
		checkString = checkString.substring(0, checkString.length() - 1);
		for (int i = 0; i < checkString.length(); i++) {
			numList.add(Integer.parseInt(Character.toString(checkString.charAt(i))));

		}
		
		// check for isbn10 size and calc values
		if (numList.size() == 9) {
			for (int i = 0; i < numList.size(); i++) {
				listSum += (numList.get(i) * (i + 1));
			}
			// assign check digit value & concatenate
			if (listSum % 11 == 10) {
				checkString += "X";
			} else {
				checkString += (listSum % 11);
			}
			// compare strings to check true
			if (checkString.equals(checkISBN)) {
				validISBN = true;
			}
		}
		// check for isbn13 size and calc values
		if (numList.size() == 12) {
			for (int i = 0; i < numList.size(); i++) {
				if ((i + 1) % 2 == 0) {
					listSum += (numList.get(i) * 3);
				} else {
					listSum += (numList.get(i) * 1);
				}
			}
			// assign check digit value & concatenate
			checkString += ((10 - (listSum % 10)) % 10);
			// compare strings to check true
			if (checkString.equals(checkISBN)) {
				validISBN = true;
			}
		}

		System.out.println(validISBN);
		// return validISBN;
	}

}
