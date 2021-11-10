
public class SchoolSchedule extends Schedule{
	
	public SchoolSchedule(){
		this.CourseID = "UNKNOWN";
		this.day = "UNKNOWN";
		this.Time = "UNKNOWN";
	}
	
	public SchoolSchedule(String CourseID, String day, String Time){
		this.CourseID = CourseID;
		this.Time = Time;
		this.day = day;
	}

	public String getClassName() {
		return CourseID;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return Time;
	}
	
	public String toString() {
		return "Class: " + CourseID + " ,Time: " + Time;
	}
}
