package edu.neu.csye6200;

public class Service extends ItemAPI{
	private String startTime;
	private String endTime;
	private String timeUnits;
	
	public Service(int returnInt, double returnDouble, String string, String string2, String string3, String string4,
			String string5) {
		// TODO Auto-generated constructor stub
		super(returnInt, returnDouble, string, string2);
		this.startTime = string3;
		this.endTime = string4;
		this.timeUnits = string5;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTimeUnits() {
		return timeUnits;
	}
	public void setTimeUnits(String timeUnits) {
		this.timeUnits = timeUnits;
	}
	@Override
	public String toString() {
		return super.toString() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", timeUnits="
				+ getTimeUnits();
	}
	
	
}
