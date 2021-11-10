import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class ClassRegistrationHP {//Home Page
	protected Vector<String> Classes = new Vector<>();
	protected Map<String,String> Prerequisite = new HashMap<>();
	protected Map<String,String> Day = new HashMap<>();
	protected Map<String,String> Time = new HashMap<>();
	
	public ClassRegistrationHP() {
	}
	
	public void addNewClasses(String requirement,String name,String day,String type,String time, 
			String location,String items,int section,String instructor,String dates){
		//day = MTWTh    type = Hybrid, Online, or Normal   time = start-end
		//items = 4 numbers(0075)  section = 2 numbers (01)
		//dates = 4/6/2020 - 6/15/2020
		String s = String.valueOf(section);
		String Class = name + "\n" + day + "\t" + type + ":" + time + "\nLocation:"
		+location+ "\nItem No"+ items + "\tSection:" + s + "\nInstructor:" + instructor 
		+"\nDates:" +dates;
		Prerequisite.put(name, requirement);
		Classes.add(Class);
		Day.put(name, day);
		Time.put(name, time);
	}
	
	public String toString() {
		String C = "";
		for(int i = 0; i < Classes.size(); i++) {
			C += Classes.get(i) + "\n\n";
		}
		return C;
	}
	
	public String getPrerequisite(String n) {
		return Prerequisite.get(n);
	}
	
	public String getDay(String c) {
		return Day.get(c);
	}
	
	public String getTime(String c) {
		return Time.get(c);
	}
	
}
