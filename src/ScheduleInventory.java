import java.util.Vector;

public class ScheduleInventory {
	protected Vector<String> ST = new Vector<String>();
	protected Vector<String> SC = new Vector<String>();
	
	public ScheduleInventory() {
		
	}
	public void addStudent(Student s) {
		String n = s.getStudentName();
		ST.add(n);
		SC.add(s.getSchoolSchedule() +"\n"+ s.getOutsideSchedule());
	}
	public String getStudentSchedule(String sn) {
		String schedule = "Student: " + sn + "\n";
		for(int i = 0; i < ST.size(); i++) {
			if(sn == ST.get(i)) {
				schedule += SC.get(i);
			}
		}
		return schedule;
	}
}
