package javapackage;

public class NestedIf {

	public static void main(String[] args) {
		//nested if
		int marks= 80;
		if(marks <= 100) {
			if (marks >=90) {
			System.out.println("A Grade");
			}
			if (marks <=80) {
				System.out.println("B Grade");
					if (marks <=50) {
						System.out.println("C Grade");
					}
			}
			else {
				System.out.println("Good Bye");
				}
		}
		else {
			System.out.println("Invalid Marks");
		}
		System.out.println("=======================");

	
	//String browser = "Chrome";
//	if (browser.equals("Chrome")) {
//		System.out.println("Launch Chrome");
//	}
//	if (browser.equals("Firefox")) {
//		System.out.println("Launch FF");
//	}
//	if (browser.equals("IE")) {
//		System.out.println("Launch IE");
//	}
//	else {
//		System.out.println("please pass the right browser");
//	}
		
	String browser = "IE";
	if (browser.equals("Chrome")) {
		System.out.println("Launch Chrome");
		}
	else if (browser.equals("Firefox")) {
		System.out.println("Launch Firefox");
		}
	else if (browser.equals("IE")) {
		System.out.println("Launch IE");
		}
	else {
		System.out.println("please pass the right browser");

	}
  }
}
	
