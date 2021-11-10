import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AmbassadorGroup {
	protected Vector<String> Registers = new Vector<String>();
	protected Map<String, String> R = new HashMap<String,String>();
	protected Vector<String> members = new Vector<String>();
	protected Map<String,String> role = new HashMap<String,String>();
	protected Map<String,String> Activities = new HashMap<String,String>();
	
	public AmbassadorGroup() {
	}
	
	public void register(String name, String introduction) {
		//get name
		//get an essay about who are you, what are the purposes of an Ambassador 
		Registers.add(name);
		R.put(name,introduction);	
	}
	
	public String getRegister(String n) {//enter name or All
		String r = "";
		for(int i = 0; i< Registers.size(); i++) {
			if(n == "All") {
				r += R.get(Registers.get(i)) + "\n";
			}else if(n == Registers.get(i)) {
				r = R.get(Registers.get(i));
			}
		}
		return r;
	}
	
	public void addMembers(String n, String r) {
		members.add(n);
		role.put(n, r);
	}
	
	public String getRole(String n) {
		return role.get(n);
	}
	
	public void addActivities(String name, String time) {
		//time = "3/3/2020 1:00-3:00PM"
		Activities.put(name, name + ": " +time);
	}
	
	public String getActivities(String n) {
		return Activities.get(n);
	}
	
	public String toString() {//get members
		String m = "";
		for(int i = 0; i< members.size(); i++) {
			m += members.get(i) + "\n";
		}
		return m;
	}
}
