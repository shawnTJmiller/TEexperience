package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesReport {
	
	File transactionsFile = new File("transactions.txt");
	private double runningTotal;
	
	public void transactionsReport(String itemName, double itemPrice) throws FileNotFoundException {
		PrintWriter writer = null;
		String transaction = itemName + "|" + String.format("%.2f", itemPrice);
		writer = new PrintWriter(new FileOutputStream(transactionsFile.getAbsoluteFile(), true));
		writer.append(transaction + "\n");
		writer.flush();
		writer.close();
	}

	public void salesReport() throws FileNotFoundException {
		Map<String, Integer> salesMap = new HashMap<String, Integer>();

		Scanner salesScan = new Scanner(transactionsFile);

		while (salesScan.hasNextLine()) {
		String[] salesArray = salesScan.nextLine().split("\\|");
		
		for (int i = 0; i < salesArray.length; i++) {
			if (!salesMap.containsKey(salesArray[i])) {
				salesMap.put(salesArray[i], 1);
				i++;
			} else {
				int count = salesMap.get(salesArray[i]);
				salesMap.put(salesArray[i], count + 1);
				i++;
			}
		}
		}
		
		Date currentDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy h_mm_ss a");
		String dateTime = ft.format(currentDate);
		File salesReport = new File(dateTime + ".txt");
		if (!salesReport.exists()) {
			try {
				salesReport.createNewFile();
			} catch (IOException e) {
				System.out.println("File log exists");
			}
		}
		File sales = new File(dateTime + ".txt");
		
		PrintWriter writer = null;
		if(salesMap.containsKey("Potato Crisps")) {
			String salesLog = String.format("%-19s", "Potato Crisps ") + salesMap.get("Potato Crisps");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double pctotal = 3.05 * salesMap.get("Potato Crisps");
			runningTotal += pctotal;
		}
		
		if(salesMap.containsKey("Stackers")) {
			String salesLog = String.format("%-19s", "Stackers ") + salesMap.get("Stackers");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double stotal = 3.05 * salesMap.get("Stackers");
			runningTotal += stotal;
		}
		
		if(salesMap.containsKey("Grain Waves")) {
			String salesLog = String.format("%-19s", "Grain Waves ") + salesMap.get("Grain Waves");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double gwtotal = 3.05 * salesMap.get("Grain Waves");
			runningTotal += gwtotal;
		}
		
		if(salesMap.containsKey("Cloud Popcorn")) {
			String salesLog = String.format("%-19s", "Cloud Popcorn ") + salesMap.get("Cloud Popcorn");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double cptotal = 3.05 * salesMap.get("Cloud Popcorn");
			runningTotal += cptotal;
		}
		
		if(salesMap.containsKey("Moonpie")) {
			String salesLog = String.format("%-19s", "Moonpie ") + salesMap.get("Moonpie");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double mptotal = 3.05 * salesMap.get("Moonpie");
			runningTotal += mptotal;
		}
		
		if(salesMap.containsKey("Cowtales")) {
			String salesLog = String.format("%-19s", "Cowtales ") + salesMap.get("Cowtales");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double cttotal = 3.05 * salesMap.get("Cowtales");
			runningTotal += cttotal;
		}
		
		if(salesMap.containsKey("Wonka Bar")) {
			String salesLog = String.format("%-19s", "Wonka Bar ") + salesMap.get("Wonka Bar");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double wbtotal = 3.05 * salesMap.get("Wonka Bar");
			runningTotal += wbtotal;
		}
		
		if(salesMap.containsKey("Crunchie")) {
			String salesLog = String.format("%-19s", "Crunchie ") + salesMap.get("Crunchie");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double crtotal = 3.05 * salesMap.get("Crunchie");
			runningTotal += crtotal;
		}
		
		if(salesMap.containsKey("Cola")) {
			String salesLog = String.format("%-19s", "Cola ") + salesMap.get("Cola");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double ctotal = 3.05 * salesMap.get("Cola");
			runningTotal += ctotal;
		}
		
		if(salesMap.containsKey("Dr. Salt")) {
			String salesLog = String.format("%-19s", "Dr. Salt ") + salesMap.get("Dr. Salt");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double dstotal = 3.05 * salesMap.get("Dr. Salt");
			runningTotal += dstotal;
		}
		
		if(salesMap.containsKey("Mountain Melter")) {
			String salesLog = String.format("%-19s", "Mountain Melter ") + salesMap.get("Mountain Melter");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double mmtotal = 3.05 * salesMap.get("Mountain Melter");
			runningTotal += mmtotal;
		}
		
		if(salesMap.containsKey("Heavy")) {
			String salesLog = String.format("%-19s", "Heavy ") + salesMap.get("Heavy");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double htotal = 3.05 * salesMap.get("Heavy");
			runningTotal += htotal;
		}
		
		if(salesMap.containsKey("U-Chews")) {
			String salesLog = String.format("%-19s", "U-Chews ") + salesMap.get("U-Chews");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double uctotal = 3.05 * salesMap.get("U-Chews");
			runningTotal += uctotal;
		}
		
		if(salesMap.containsKey("Little League Chew")) {
			String salesLog = String.format("%-19s", "Little League Chew ") + salesMap.get("Little League Chew");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double llctotal = 3.05 * salesMap.get("Little League Chew");
			runningTotal += llctotal;
		}
		
		if(salesMap.containsKey("Chiclets")) {
			String salesLog = String.format("%-19s", "Chiclets ") + salesMap.get("Chiclets");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double chtotal = 3.05 * salesMap.get("Chiclets");
			runningTotal += chtotal;
		}
		
		if(salesMap.containsKey("Triplemint")) {
			String salesLog = String.format("%-19s", "Triplemint ") + salesMap.get("Triplemint");
			try {
				writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.append(salesLog + "\n");
			writer.flush();
			double tmtotal = 3.05 * salesMap.get("Triplemint");
			runningTotal += tmtotal;
		}
		
		String salesLog = "Total Sales to Date: $" + String.format("%.2f", runningTotal);
		try {
			writer = new PrintWriter(new FileOutputStream(sales.getAbsoluteFile(), true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.append(salesLog + "\n");
		writer.flush();
		writer.close();
		salesScan.close();
	}

}
