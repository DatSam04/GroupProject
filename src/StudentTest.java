import java.util.Scanner;

import javax.xml.soap.Node;

public class StudentTest {

	public static void main(String[] args) {
		Student joey = new InternationalStudent("joey", 123456);
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
						+ " or above?");
				Scanner a = new Scanner(System.in);
				String  r = a.nextLine();
				if(r.equalsIgnoreCase("yes")) {
					joey.addCourseToSchedule(new SchoolSchedule(C, SSC.getDay(C), SSC.getTime(C)));
				}else if(r.equalsIgnoreCase("no")) {
					System.out.println("You need to pass MATH&151 with 2.0 or above");
				}
			}else if(C.equalsIgnoreCase("MATH&152")) {
				System.out.print("Did you pass " + SSC.getPrerequisite(C) + " with 2.0"
						+ " or above?");
				Scanner e = new Scanner(System.in);
				String  r = e.nextLine();
				if(r.equalsIgnoreCase("yes")) {
					joey.addCourseToSchedule(new SchoolSchedule(C, SSC.getDay(C), SSC.getTime(C)));
				}else if(r.equalsIgnoreCase("no")) {
					System.out.println("You need to pass MATH&151 with 2.0 or above");
				}
			}
			System.out.print("Enter Class Name(Or E to exit):");
			Scanner w = new Scanner(System.in);
			C = w.next();
		}
		System.out.println(joey.getSchoolSchedule());
		
		
	}

}
