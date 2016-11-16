package Robo;

public class MobileRobot extends Robot {
	private int    power;
	private byte   status;
	private double speed;
	
	public MobileRobot(){
		super();
	}
	
	public MobileRobot(String name){
		super(name);
	}
	
	public MobileRobot( String name, int temperature , int power,
					    byte status, double speed )
	{
		super(name, temperature);
		this.power = power;
		this.status = status;
		this.speed = speed;
	}
	
	public int getPower(){
		return power;
	}
	
	public void setPower(int power){
		this.power = power;
	}
	
	public byte getStatus(){
		return status;
	}
	
	public void setStatus(byte status){
		this.status = status;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
	}
	
	public String toString(){
		return "Nome: "          + this.getName() +
			   "\nTemperatura: " + this.getTemperature() +
			   "\nPower: "       + this.getPower() +
			   "\nStatus: "      + this.getStatus() +
			   "\nSpeed "        + this.getSpeed();
	}
	
	
}
