
public class Job  {
	protected String jobType;
	protected double income;
	protected double expenses;
	protected double scholarship;	
	protected String position;
	
	
	Job(String position, String jobType, double income, double expenses){		
		this.position = position;
		this.jobType = jobType;
		this.income = income;	
		this.expenses = expenses;		
	}	
	
	public Job() {
		
	}

	public String getPosition() {
		return position;
	}
	public String getJobType() {
		return jobType;
	}
	public double getIncome() {
		return income;
	}	
	public String toString() {
		return " is working as a/an " + this.getJobType() + " at "+ this.getPosition()+".";
	}
	public double getNet(double income, double expense) {
		double net = 0.0;
		net = income - expense;		
		return net;
	}
	public double incomeTotal (double hourlyRate, double workHours){
		return this.income = hourlyRate * workHours;
	}
	public String saver(double net, double income, double expense){			
		if (net <= 100.0 && net >= 0.0){
			System.out.println("You only save this amount: $" + net + ". So, you need to save more.");			
		}
		else if (net>= 101.0){
			System.out.println("You can save this amount: $" + net + " Congratulation ^_^ big saver.");			
		}
		else{
			System.out.println("WARNING!!!. You spend extra this amout $ " + net + " You will be broke pretty soon.");				
		}
		return "";		
	}
	
}
