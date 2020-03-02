import java.util.Scanner;

public class Applicant {
	
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

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];
		for (int i = 0; i < 4; i++) {
		System.out.print("Enter " + i + ". name: ");
		System.out.print("Enter points: ");
	}

}
}

