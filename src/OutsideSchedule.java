
public class OutsideSchedule extends Schedule{
	
	public OutsideSchedule(String activities, String day, String lesiureTime, String prep){
		this.Activities = activities;
		this.Time = lesiureTime;
		this.Preparation = prep;
		this.day = day;
	}
	
	public String getTime() {
		return null;
	}
	
	public String getActivities() {		
		return Activities;
	}
	
	public String getDay() {		
		return day;
	}
	
	public String getClassName() {		
		return null;
	}	
	
	public String getLeisureTime(){
		return Time;
	}
	
	public String getPreparation() {
		return Preparation;
	}
	
	public String toString() {		
		return "Activity: " + Activities + ", Time: " + Time
				+ ", Preparation: " + Preparation;
	}
}
