import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		Student joey = new InternationalStudent("joey", 123456);
		ScheduleInventory st = new ScheduleInventory();
		st.addStudent(joey);
		Introduction i = new Introduction();
		System.out.print(i.getDisplayInstructions());
		System.out.print("Enter what you want(quit 'E'): ");
		Scanner console = new Scanner(System.in);
		String s = console.next();
		while(!s.equalsIgnoreCase("E")) {
			if(s.equalsIgnoreCase("GS")) {// get school and outside schedules
				System.out.println(st.getStudentSchedule("joey"));
			}else if(s.equalsIgnoreCase("RC")) {// register class
				RegisterClass(joey, st);
			}else if(s.equalsIgnoreCase("OS")) {//add outside activity
				AddOutsideSchedule(joey, st);
			}else if(s.equalsIgnoreCase("GJ")) {
				GetJob(joey);//get job
				
			}else if(s.equalsIgnoreCase("GP")) {//group information
				i.processSelection();
			}else if(s.equalsIgnoreCase("RG")) {//register group
				joey.addGroups(RegisterGroup(joey));
			}else if(s.equalsIgnoreCase("RM")) {//get resume
				getResume(joey);
			}
			System.out.print("Enter what you want(quit 'E'): ");
			console = new Scanner(System.in);
			s = console.next();
		}
	}
	
	public static void getResume(Student s) {
		newResume r = new newResume();
		r.getDetails(s);
		System.out.print("Enter your GPA each quarter you have studied (Spring 2020, 3.9): ");
		Scanner console = new Scanner(System.in);
		String line = console.nextLine();
		while(!line.equalsIgnoreCase("E")) {
			String arr[] = line.split(", ", 2);
			String ans = arr[0];
			double num = Double.valueOf(arr[1]);
			r.addGrade(num, ans);
			System.out.print("Enter the previous quarter (or E to exit): ");
			console = new Scanner(System.in);
			line = console.nextLine();
		}
		System.out.println();
		System.out.println("Number of Job had worked: " + r.getCount());
		System.out.println("Number of Group had joined: " + s.getGroups());
		System.out.println("Quarter GPA: " + r.getQuarterGPA());
		System.out.printf("Current GPA: " + "%.2f", r.getGrade());
		System.out.println();
	}
	
	public static String RegisterGroup(Student s) {
		AmbassadorGroup A = new AmbassadorGroup();
		CSCLearningGroup CSC = new CSCLearningGroup();
		StudentGovernmentGroup SG = new StudentGovernmentGroup();
		String group = "";
		System.out.println("Enter A (for Ambassador)\nEnter CSC (for CSCLearning)\nEnter SG (for"
				+ " StudentGovernment)");
		System.out.print("Which groups do you want to join? ");
		Scanner console = new Scanner(System.in);
		String ans = console.next();
		if(ans.equalsIgnoreCase("A")) {
			A.addMembers(s.getStudentName(), "member");
			group = "Ambassador";
		}else if(ans.equalsIgnoreCase("CSC")) {
			CSC.addMembers(s.getStudentName(), "member", "Coding");
			group = "CSCLearning";
		}else if(ans.equalsIgnoreCase("SG")) {
			SG.addMember(s.getStudentName(), "member");
			group = "StudentGovernment";
		}
		return group;
	}
	
	public static void AddOutsideSchedule(Student s, ScheduleInventory I) {
		System.out.print("Do you want to add Activity(YES/NO)?");
		Scanner ans = new Scanner(System.in);
		String answer = ans.next();
		while(!answer.equalsIgnoreCase("no")) {
			System.out.print("Enter Activity Name: ");
			Scanner n = new Scanner(System.in);
			String name = n.nextLine();
			System.out.print("Enter Activity Date(M/T/W/th): ");
			Scanner d = new Scanner(System.in);
			String date = n.nextLine();
			System.out.print("Enter Activity time(10:00-1:00): ");
			Scanner t = new Scanner(System.in);
			String time = n.nextLine();
			System.out.print("Enter Activity Requirement(String): ");
			Scanner r = new Scanner(System.in);
			String req = n.nextLine();
			s.addActivitiesToSchedule(new OutsideSchedule(name, date, time, req));
			System.out.print("Do you want to add Activity(no to exit)? ");
			ans = new Scanner(System.in);
			answer = ans.next();
		}
		I.addStudent(s);
	}
	
	public static void RegisterClass(Student s, ScheduleInventory I) {
		ClassRegistrationHP SSC = new ClassRegistrationHP();
		SSC.addNewClasses("ENGL&101","ENGL&235","Online","Online","Online","Online","9892", 
				70,"Lopez", "4/6/2020-6/19/2020");
		SSC.addNewClasses("MATH&151","PHYS&221","MW","Hybrid","1:15-2:20PM","OLY 0200","0426", 
				01,"Baker, T", "4/6/2020-6/19/2020");
		SSC.addNewClasses("MATH&151","MATH&152","MTWth","Normal","12:00-1:05PM","UNI 0100",
				"0942" , 02,"Lopez", "4/6/2020-6/19/2020");
		System.out.print("Enter Class Name:");
		Scanner console = new Scanner(System.in);
		String C = console.next();
		while(!C.contentEquals("E")) {
			if(C.equalsIgnoreCase("PHYS&221")) {
				System.out.print("Did you pass " + SSC.getPrerequisite(C) + " with 2.0"
						+ " or above(YES OR NO)?");
				Scanner a = new Scanner(System.in);
				String  r = a.nextLine();
				if(r.equalsIgnoreCase("yes")) {
					s.addCourseToSchedule(new SchoolSchedule(C, SSC.getDay(C), SSC.getTime(C)));
				}else if(r.equalsIgnoreCase("no")) {
					System.out.println("You need to pass MATH&151 with 2.0 or above.");
				}
			}else if(C.equalsIgnoreCase("MATH&152")) {
				System.out.print("Did you pass " + SSC.getPrerequisite(C) + " with 2.0"
						+ " or above(YES OR NO)?");
				Scanner e = new Scanner(System.in);
				String  r = e.nextLine();
				if(r.equalsIgnoreCase("yes")) {
					s.addCourseToSchedule(new SchoolSchedule(C, SSC.getDay(C), SSC.getTime(C)));
				}else if(r.equalsIgnoreCase("no")) {
					System.out.println("You need to pass MATH&151 with 2.0 or above.");
				}
			}
			System.out.print("Enter Class Name(Or E to exit):");
			Scanner w = new Scanner(System.in);
			C = w.next();
		}
		I.addStudent(s);
	}
	
	public static void GetJob(Student s) {
		Job j = new Job();
		Scanner console = new Scanner (System.in);
		System.out.print("Enter your position: ");
		String position = console.nextLine();
		System.out.print("Enter your job Type: ");
		String jobType = console.nextLine();
		System.out.print("Enter your one week working hours: ");
		double workHour = console.nextDouble();
		System.out.print("Enter your hourly pay rate: ");
		double hourlyRate = console.nextDouble();
		System.out.print("Enter your monthly expenses: ");
		double expenses = console.nextDouble();		
		double income = workHour * hourlyRate;		
		Job total = new Job (jobType, position,income , expenses );
		System.out.println(s + total.toString());
		System.out.println("Your income is $" + total.getIncome()+ ".");
		System.out.println(total.saver(total.getNet(income, expenses), income, expenses));
	}

}
