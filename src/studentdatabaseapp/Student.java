package studentdatabaseapp;

import java.util.Scanner;

import javax.swing.GrayFilter;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOFCourse = 600;
	private static int id = 1000;

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

		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}

	// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, users hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n	" + course;
				tuitionBalance = tuitionBalance + costOFCourse;
			} else {
				break;
			}
		} while (1 != 0);

	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay Tuition
	public void payTuition() {
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		viewBalance();
	}

	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}

}
