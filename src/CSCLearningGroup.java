import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CSCLearningGroup {
	protected Vector<String> members = new Vector<String>();
	protected Map<String,String> role = new HashMap<String,String>();
	protected Map<String,String> Skilled = new HashMap<String,String>();
	protected String MT; //Meeting time
	protected String deadline;
	protected Map<String,String> Works = new HashMap<String,String>();

	public CSCLearningGroup() {
	}

	public void addMembers(String name, String r, String S) {//name, role, skill
		members.add("("+r+")"+name);
		role.put(name,r);
		Skilled.put(name, S);
	}
	
	public void setWorks(String name, String W) {
		Works.put(name, W);
	}
	
	public String getWorks(String n) {
		return Works.get(n);
	}
	
	public String getSkilled(String n) {
		return Skilled.get(n);
	}
	
	public String toString() {//get members
		String m = "";
		for(int i = 0; i < members.size(); i++) {
			m += members.get(i) + "\n";
		}
		return m;
	}
	
	public void setMeetingTime(String day, String time, String place) {
		MT = day + " " + time + " " + place;
	}
	
	public void setDeadline(String day, String time) {//Monday 12:00PM
		deadline = day + " " + time;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public String getRole(String name) {
		return role.get(name);
	}
	
	public String getMeetingTime() {
		return MT;
	}
}
