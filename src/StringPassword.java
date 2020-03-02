import java.util.Scanner;

public class StringPassword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username1 = input.nextLine();
        System.out.print("Enter password: ");
        String password1 = input.nextLine();
        if(validatePassword(username1,password1)==true) {
        	System.out.print("OK");
        }
        else {
        	System.out.print("NOT OK");
        }
	}

    public static boolean validatePassword(String username, String password1) {

    	if(password1.length()<8) {
			return false;
		}
		else {
			if(password1.contains(username.toLowerCase())== true) {
				return false;
			}
			else {
				return true;
			}
		}
        }
	}
	 



