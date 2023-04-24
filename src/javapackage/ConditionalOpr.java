package javapackage;

public class ConditionalOpr {

	public static void main(String[] args) {
		int i= 10;
		int j= 20;
		System.out.println(i==j);
		
		if( i==j) {
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}	
		if (j>=i) {
			System.out.println("MJ");
		}
		if (i<=j) {
			System.out.println("vriti");
		}
		if (true) {
			System.out.println("Mohit");
		}
		else {
			System.out.println("Byeee");// Dead code
		}
		if (false) {
			System.out.println("Mohit");//dead code
		}
		else {
			System.out.println("Byeee");
			System.out.println("=========");
		}
		boolean ko = false;
		if(ko) {
			System.out.println("Hi");
		}
		else {
			System.out.println("hello");
		}
		
		
		
		
	}
}
