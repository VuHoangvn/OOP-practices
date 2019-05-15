package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private String tuitionBalance;
	private int costOFCourse = 600;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student first name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Frshment\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
	}
	
	// Generate an ID
	
	// Enroll in courses
	
	// View balance
	
	// Pay Tuition
	
	// Show status
}
