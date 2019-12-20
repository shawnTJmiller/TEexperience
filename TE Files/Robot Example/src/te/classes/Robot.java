package te.classes;

public class Robot {

	//***DATA*MEMBERS**************************
	private boolean isSelfAware;
	private int numberOfLimbs;
	private int numberOfLasers = 1;
	private double sensingDistance;
	private double ambientTemperature;
	
	//***CONSTRUCTORS**************************
	public Robot(int numberOfLimbs, int numberOfLasers, double sensingDistance, double ambientTemperature) {
	
		this.isSelfAware = isSelfAware;
		this.numberOfLimbs = numberOfLimbs;
		this.numberOfLasers = numberOfLasers;
		this.sensingDistance = sensingDistance;
		this.ambientTemperature = ambientTemperature;
	}


	//***GETTERS*&*SETTERS*********************
	public int getNumberOfLimbs() {
		return numberOfLimbs;
	}
	public int getNumberOfLasers() {
		return numberOfLasers;
	}
	public void setNumberOfLasers(int numberOfLasers) {
		this.numberOfLasers = numberOfLasers;
	}
	public double getSensingDistance() {
		return sensingDistance;
	}
	public void setSensingDistance(double sensingDistance) {
		this.sensingDistance = sensingDistance;
	}
	public void checkTemperature() {
		if (ambientTemperature < 35) {
			System.out.println("it's too cold.");
		}
		if (ambientTemperature > 95) {
			System.out.println("it's too hot.");
		}
	}
	public double getAmbientTemperature() {
		return ambientTemperature;
	}
	public void setAmbientTemperature(double ambientTemperature) {
		this.ambientTemperature = ambientTemperature;
	}
	
}
