import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class StudentGovernmentGroup {
	protected Vector<String> members = new Vector<String>();
	protected Map<String,String> Role = new HashMap<>();
	protected Vector<String> reports = new Vector<String>();
	protected Map<String,String> R = new HashMap<>();//report
	protected String OfficeHour = "M-Th:\n9:00-12:00AM\n1:00-4:00PM\nF:\n9:00-1:00";
	protected Map<String,String> register = new HashMap<>();//report
	protected String requirement;//requirement for register
	protected Map<String,Double> GPA = new HashMap<>();
	
	public StudentGovernmentGroup() {
	}
	
	public void register(String name, String document, double GPA) {
		register.put(name, name + "\n"+document);//document can only be checked by Vice or Present
		this.GPA.put(name, GPA);
	}
	
	public void setRequirement(String r) {//r = "GPA, Classes had to be studied before
		requirement = r;
	}
	
	public String getRequirement() {
		return requirement;
	}
	
	public void addMember(String n, String r) {//name, role
		if(this.GPA.get(n) > 3.5) {
			members.add(n);
			Role.put(n, r);
		}
	}
	
	public String getMember() {
		String m = "";
		for(int i = 0; i < members.size(); i++) {
			m += members.get(i) + "\n";
		}
		return m;
	}
	
	public String getRole(String name) {
		return Role.get(name);
	}
	
	public void addReport(String name, String r) {//name, report
		reports.add(name + ":\n" +r);
		R.put(name, name + "\n" +r);
	}
	
	public String getAllReport() {
		String r = "";
		for(int i = 0; i < reports.size(); i++) {
			r += reports.get(i) + "\n";
		}
		return r;
	}
	
	public String getReport(String n) {
		return R.get(n);
	}
	
	public void clearReport(String name) {
		R.clear();
	}
	
	public void setOfficeHour(String time) {//M-Th:\n9:00-12:00AM\n1:00-4:00PM
		OfficeHour = time;
	}
	
	public String toString() {
		return OfficeHour;
	}
}
