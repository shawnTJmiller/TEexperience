package te.examples.MavenPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PulseExamples {

//	public static void main (String[] args) throws IOException {		
//		String theString = "LaLaLaLaLa";
//		theString.replace("a", "o");
//		System.out.println(theString);
//		theString = theString.replace("H", "o");
//		System.out.println(theString);
//	}
	
	public static void main (String[] args) throws FileNotFoundException {
		
//		NYY	103	59	.636	  --	943	739	.610
//		TBR	96	66	.593	 7.0	769	656	.572
//		BOS	84	78	.519	19.0	901	828	.539
//		TOR	67	95	.414	36.0	726	828	.440
//		BAL	54	108	.333	49.0	729	981	.367
		
		File inputFile = new File("notes/MLB Stats.txt");
		
		if(inputFile.exists()) {
			System.out.println("File Exists.  Starting data parse...");
		}
		
		Scanner mlbScanner = new Scanner(inputFile.getAbsoluteFile());
		
		int lineCounter = 0;
		while(mlbScanner.hasNextLine()) {
			String tempLine = mlbScanner.nextLine();
			lineCounter++;
			String[] lineData = tempLine.split("\\s+");
			//System.out.println(lineData[0]);
			Double winLossRatio = Double.parseDouble(lineData[1]) / Double.parseDouble(lineData[2]);
			String TeamName = lineData[0];
			
			System.out.println(TeamName + " has " + lineData[1] + " wins and " + lineData[2] + " losses.  Thaey have a W/L ratio of: " + winLossRatio);
		}
		System.out.println(lineCounter + " lines of data processed.");
	}
	
	
}
