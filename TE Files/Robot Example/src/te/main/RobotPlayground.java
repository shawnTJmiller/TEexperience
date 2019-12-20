package te.main;

import te.classes.Robot;

public class RobotPlayground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot robot01 = new Robot(8, 2, 30.0, 50.125);
		
		int robot01NumberOfArms = robot01.getNumberOfLimbs();
		System.out.println(robot01NumberOfArms);
		
		robot01.checkTemperature();
		System.out.print(robot01);
		
	}

}
