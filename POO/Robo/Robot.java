package Robo;

public class Robot {
	private String name;
	private double temperature;
	
	public Robot(){
		super();
	}
	
	public Robot(String name){
		this.name = name;
	}
	
	public Robot(String name, int temperature){
		this.name        = name;
		this.temperature = temperature;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public double getTemperature(){
		return temperature;
	}

	public void setTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public String toString(){
		return "Nome: "          + this.getName() +
			   "\nTemperatura: " + this.getTemperature();
	}
}
