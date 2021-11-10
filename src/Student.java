import java.util.Vector;

public abstract class Student {
	protected String studentName;
	protected int studentID;
	protected Vector<Schedule> schedule = new Vector<Schedule>();
	protected Vector<Schedule> OutsideSchedule = new Vector<Schedule>();
	protected Vector<String> Groups = new Vector<String>();
	
	public abstract String getStudentName();
	/* This method return the student name
	 * 
	 */
	public abstract int getStudentID();
	/*
	 * get student ID
	 */
	public abstract void addCourseToSchedule(SchoolSchedule n);
	/*
	 * add class, day, and time to schedule
	 */
	public abstract String getSchoolSchedule();
	/*
	 * get the school schedule
	 */
	public abstract void addActivitiesToSchedule(OutsideSchedule o);
	/*
	 * add activities, time, day, preparation for outside school
	 */
	public abstract String getOutsideSchedule();
	/*
	 * get schedule of outside school
	 */
	public abstract void addGroups(String g);
	/*
	 * add group
	 */
	public abstract int getGroups();
	/*
	 * get how many group student has attended
	 */
}
