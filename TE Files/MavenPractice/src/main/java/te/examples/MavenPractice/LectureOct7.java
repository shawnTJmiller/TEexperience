package te.examples.MavenPractice;

public class LectureOct7 {

	public String theEnd(String string, boolean b) {
		// TODO Auto-generated method stub
		if (!b) {
			return string.substring(string.length()-1);
		}
			return string.substring(0,1);		
	}

}
