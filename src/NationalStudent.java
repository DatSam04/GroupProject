
public class NationalStudent extends Student {

	public NationalStudent(String name, int studentID) {
		this.studentName = name;
		this.studentID = studentID;
	}

	public String toString() {
		return studentName;
	}

	public String getStudentName() {
		// TODO Auto-generated method stub
		return this.studentName;	
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void addCourseToSchedule(SchoolSchedule n){
		schedule.add(n);
	}
	
	public void addActivitiesToSchedule(OutsideSchedule o){
		OutsideSchedule.add(o);
	}

	public double GPA() {
		return 0;
	}

	public String activities() {
		return null;
	}

	public String getSchoolSchedule() {
		String SS = "SchoolSchedule\n";
		String M = "Monday:\n";
		String T = "Tuesday:\n";
		String W = "Wednesday:\n";
		String Th = "Thursday:\n";
		for(int i = 0; i < schedule.size(); i++) {
			for(int o = 0; o < schedule.get(i).getDay().length(); o++) {
				if(schedule.get(i).getDay().charAt(o) == 'M') {
					M += schedule.get(i) + "\n";
				}else if(schedule.get(i).getDay().charAt(o) == 'T') {
					T += schedule.get(i) + "\n";
				}else if(schedule.get(i).getDay().charAt(o) == 'W') {
					W += schedule.get(i) + "\n";
				}else if(schedule.get(i).getDay().charAt(o) == 'h') {
					Th += schedule.get(i) + "\n";
				}
			}
		}
		SS += M + "\n" + T + "\n" + W + "\n" + Th;
		return SS;
	}

	public String getOutsideSchedule() {
		String OS = "OutsideSchedule\n";
		String M = "Monday:\n";
		String T = "Tuesday:\n";
		String W = "Wednesday:\n";
		String Th = "Thursday:\n";
		for(int i = 0; i < OutsideSchedule.size(); i++) {
			for(int o = 0; o < OutsideSchedule.get(i).getDay().length(); o++) {
				if(OutsideSchedule.get(i).getDay().charAt(o) == 'M') {
					M += OutsideSchedule.get(i) + "\n";
				}else if(OutsideSchedule.get(i).getDay().charAt(o) == 'T') {
					T += OutsideSchedule.get(i) + "\n";
				}else if(OutsideSchedule.get(i).getDay().charAt(o) == 'W') {
					W += OutsideSchedule.get(i) + "\n";
				}else if(OutsideSchedule.get(i).getDay().charAt(o) == 'h') {
					Th += OutsideSchedule.get(i) + "\n";
				}
			}
		}
		OS += M + "\n" + T + "\n" + W + "\n" + Th;
		return OS;
	}

	public int getGroups() {
		int g = 0;
		for(int i = 0; i < Groups.size(); i++) {
			g += 1;
		}
		return g;
	}
	
	public void addGroups(String g) {
		Groups.add(g);
	}

}
