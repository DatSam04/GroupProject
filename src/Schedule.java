
public abstract class Schedule {
	protected String CourseID; //Class Name
	protected String Time;//8:15 A.M - 9:00 A.M
	protected String day;
	protected String Activities;
	protected String Preparation;
	
	public abstract String getClassName();
	/*
	 * Class Name
	 */
	
	public abstract String getTime();
	/*
	 * Start Time - End Time
	 */
	
	public abstract String getDay();
	/*
	 * day of week
	 */
	public abstract String toString();
}
