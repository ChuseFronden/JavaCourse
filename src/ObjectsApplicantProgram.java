import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];
		for (int i = 0; i < 4; i++) {
		System.out.print("Enter " + i+1 + ". name: ");
		String name = input.nextLine();
		
		System.out.print("Enter points: ");
		int points = Integer.parseInt(input.nextLine());
		applicantArray[i] = new Applicant(name, points);
	     }

        System.out.print("Enter the minimum of required points: ");
        int minpoints = Integer.parseInt(input.nextLine());
        System.out.println("The following applicants achived the minimum of " + minpoints + " points: ");
        
        for (int i = 0; i < 4; i++) {
	    if (applicantArray[i].getPoints() >= minpoints) {
		System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints());
	    }
          }

           }

}
     class Applicant {
	
	private String name;
	private int points;
	
	public Applicant (String name, int points) {
	this.name = name; 
	this.points = points;
	}
	
	public String getName() {
	return name;
	}
	
	public int getPoints() {
	return points;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	}