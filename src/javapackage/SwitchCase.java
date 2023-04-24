package javapackage;

public class SwitchCase {

	public static void main(String[] args) {
		String browser = "IE";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome");
			break;
		case "Firefox":
			System.out.println("firefox");
			break;
		case "safari":
			System.out.println("safari");
			break;
		default:
			System.out.println("pass valid browser");
			break;
		}


int marks = 85;
	switch (marks) {
	case 100:
		System.out.println("Grade A");
		break;
	case 90:
		System.out.println("Grade B");
		break;
	case 80:
		System.out.println("Grade C");
		break;
	default:
		System.out.println("Fail");
		break;

	}
	System.out.println("====================");

	//UseCases
		//	Cross Browser
		//	Multiple Env
	
	String Env = "Qa ";
	switch (Env.toUpperCase().trim()) {
	case "QA":
		System.out.println("Pass the QA Env");
		break;
	case "DEV":
		System.out.println("Pass the DEV Env");
		break;
	case "Prod":
		System.out.println("Pass the Prod Env");
		break;
	case "Preprod":
		System.out.println("Pass the Preprod Env");
		break;
	default:
		System.out.println("Pass the Valid Env");
		break;
	}
	
	System.out.println("==============");
	// 3 numbers compare
	
	int x = 200;
	int y = 300;
	int z = 400;
	if (x>y && x>z) {
		System.out.println("X is greatest");
	}
	else if (y>z) {
		System.out.println("Y is greatest");
	}
	else {
		System.out.println("Z is graetest");
		}
	
	}
}