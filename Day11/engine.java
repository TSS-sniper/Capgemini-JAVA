package Day11;

public class engine {
	private int noofPiston;
	private String power;
	private String type;
	public int getNoofPiston() {
		return noofPiston;
	}
	public void setNoofPiston(int noofPiston) {
		this.noofPiston = noofPiston;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public engine(int noofPiston, String power, String type) {
		this.noofPiston = noofPiston;
		this.power = power;
		this.type = type;
	}
	
	
}
