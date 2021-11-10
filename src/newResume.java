
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class newResume {
	ArrayList<String> desc = new ArrayList<String>();
	ArrayList<String> company = new ArrayList<String>();
	ArrayList<String> position = new ArrayList<String>();
	ArrayList<String> sdate = new ArrayList<String>();
	ArrayList<String> edate = new ArrayList<String>();
	LinkedList GPA = new LinkedList();
	ListNode QuarterGPA = new ListNode();
	Map<String, String> quarter = new HashMap<String,String>();

	public newResume() {

	}

	Scanner sc = new Scanner(System.in);
	
	public void addGrade(double n, String q) {
		GPA.add(n);
		quarter.put(q, q + ": " + n);
	}
	
	public String getQuarterGPA(String s) {//get GPA of a specific quarter
		return quarter.get(s);
	}
	
	public ListNode getQuarterGPA() {//get number only
		ListNode current = QuarterGPA;
		for(int i = 0; i < GPA.size(); i++) {
			current.next = new ListNode(GPA.get(i));
			current = current.next;
		}
		return QuarterGPA;
	}
	
	public double getGrade() {//Current GPA
		double G = 0.0;
		int num = 0;
		for(int i = 0; i < GPA.size(); i++) {
			G += GPA.get(i);
			num += 1;
		}
		return G/num;
	}
		
	public String getExist() {
		System.out.print("Do you want to exit(e) or keep running(yes): ");
		String ch = sc.nextLine();
		return ch;
	}

	public ArrayList<String> getcompany() {
		System.out.print("Enter company: ");
		String comp = sc.nextLine();
		company.add(comp);
		return company;
	}

	public ArrayList<String> getposition() {
		System.out.print("Enter role: ");
		String role = sc.nextLine();
		position.add(role);
		return position;
	}

	public ArrayList<String> getStartDate() {
		System.out.print("Enter start date: ");
		String start = sc.nextLine();
		sdate.add(start);
		return sdate;
	}

	public ArrayList<String> getEndDate() {
		System.out.print("Enter end date: ");
		String end = sc.nextLine();
		edate.add(end);
		return edate;
	}

	public ArrayList<String> getDiscription() {
		System.out.print("Enter your job experiences: ");
		String s = sc.nextLine();
		desc.add(s);
		return desc;
	}

	public void getDetails(Student s) {
		while (!getExist().equalsIgnoreCase("e")) {
			getcompany();
			getposition();
			getStartDate();
			getEndDate();
			getDiscription();
		}
		System.out.println("\t\t\t" + "RESUME OF " + s.getStudentName() + "\t\t\t");		
		System.out.printf("%10s %15s %21s %20s", "Jobs", "Role", "Start Date", "End Date");
		System.out.println();
		Iterator<String> iter = position.iterator();
		Iterator<String> iter1 = company.iterator();
		Iterator<String> iter2 = sdate.iterator();
		Iterator<String> iter3 = edate.iterator();
		Iterator<String> iter4 = desc.iterator();
		while (iter.hasNext()) {
			while (iter1.hasNext()) {
				while (iter2.hasNext()) {
					while (iter3.hasNext()) {
						while (iter4.hasNext()) {
							System.out.printf("%10s %15s %21s %20s", iter1.next(), iter.next(), iter2.next(),
									iter3.next());
							System.out.println();
							System.out.println(iter4.next());
							System.out.println();
						}
					}
				}
			}
		}

	}
	
	  public int getCount() {
		int count = 0;
		for(int i = 0; i < company.size(); i++) {
			count ++;
		}
		return count;
	}
	  
	  
}
	 
