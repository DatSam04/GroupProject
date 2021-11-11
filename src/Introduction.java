import java.util.Scanner;

public class Introduction {	
	
	public Introduction(){
		
	}	
	
	public String getDisplayInstructions() {
		String instruction = "";	
		instruction+= "This is the STUDENT PROGRAM Introduction ^_^ .  \n";
		instruction += "This program shows the student activites (when they do, if they have a lesiure time)";
		instruction += ", school schedule, and their job [income and expenses].\n";			
		instruction += "If a student wants to join one of these group(student goverment, ambassador, and CSC group)";
		instruction += ", they can see how the group is working.\n";		
		instruction += "In addition, they can decide that they want to join or not.";
		instruction += "Also, this project can help student to register their classes.\n";	
		instruction += "Enter GS(for get Schedule)\n";
		instruction += "Enter RC(for register class)\n";
		instruction += "Enter OS(for add outside schedule)\n";
		instruction += "Enter GJ(for get job)\n";
		instruction += "Enter GP(to learn more about groups)\n";
		instruction += "Enter RG(to register to a group)\n";
		instruction += "Enter RM(to open Resume)\n";
		return instruction;
	}
	
	public String getDisplayMenu() {	
		String display = "";		
		display += "You can be a member of one of these groups.\n";	
		display += "Choose your favorite group ^_^\n";		
		display += "Want to you know more about your group @@@@\n";
		display += "Enter one of those options:\n";
		display += "\t 'CSC' for computer science group\n";
		display += "\t 'A' for ambassador group\n";
		display += "\t 'G' for Student Goverment Group\n";
		display += "\t 'E' for exist the program\n";
		display += "Enter your selection: ";
		return display;
	}
	public String checkResult() {
		boolean done = false;
		Scanner console = new Scanner (System.in);
		String result = "";
		
		while(!done) {			
			getDisplayMenu();
			String selection = "";
			result = "";
			done = true;			
				
		}
		done = true;
		System.out.println("Thank you ^_*");
		return result;
			
	}
	
	public String getUserSelection() {
		Scanner console = new Scanner(System.in);
		return console.next();
	}
	public void processSelection () {	
		System.out.print(getDisplayMenu());
		String selection = getUserSelection();
		String result = "";
		while(!selection.equalsIgnoreCase("E")) {		
			if (selection.equalsIgnoreCase("CSC")) {
				System.out.println(getIntroductionCSC() + "\n");
			}
			else if (selection.equalsIgnoreCase("A")) {
				System.out.println(getIntroductionAmbassador() + "\n");
			}
			else if (selection.equalsIgnoreCase("G")){
				System.out.println(getStudentGoverment() + "\n");
			}
			else {			
				System.out.println("Incorrect entry... please try again.\n");
			}
			System.out.print("Eneter your next selection: ");
			Scanner console = new Scanner(System.in);
			selection = console.next();
		}
		
	}
	public String getStudentGoverment() {
		String gString = "";
		gString += "The Student Goverment stands for the all students who study in the South Seattle College. It supports student";
		gString += "to accomplish this commitment by promoting";		
		gString += " and encouraging self-development, community involvement, \n";
		gString += "and culture sensitivity.";
		gString += "It does have so many activites like student voices, votings, and rights, \n";
		gString += "which can join every students ";
		gString += "who can lead to talk what they do need to support from goverment or college.\n";
		gString += "Students can also get volunteer credits for joining these activites.";
		return gString;
	}
	public String getIntroductionAmbassador(){
		String aString = "";		
		aString += "This Ambassador group help new students(especially International Students) who need to know \n";
		aString += "the South Seattle College system such as rule and regulations , buildings, or programs. If new students \n";
		aString += "do not know something, they will help them until they are okie. ";		
		aString += "For example, if they face some troubles  \n";		
		aString += "with their host family or landloard, they will help them, and give a some useful ideas to them.\n";
		aString += "You can also enjoy your lesiure time with them, if they do have an outdoor activities such as snowskating,\n";		
		aString += "movie night, or snowtubing.";		
		return aString;
		
	}
	public String getIntroductionCSC(){
		String resultString = "";
		resultString += "This CSC group supports to students who want to do";
		resultString += " a good portfolio for their career.\n";
		resultString += "This team also warmly welcome to meet the group members each other.\n";
		resultString += "If you are a CSC member, you might join this group";
		resultString += " because this group will help you to start build your career.";		
		return resultString;
		
	}
	

}
