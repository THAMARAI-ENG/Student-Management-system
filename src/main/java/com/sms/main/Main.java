package com.sms.main;
import com.sms.model.Student;
import com.sms.operation.StudentDao;
import java.util.*;

public class Main {
	 
	static StudentDao dao = new StudentDao();
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.ADD STUDENT");
			System.out.println("2.DELETE STUDENT");
			System.out.println("3.UPDATE STUDENT");
			System.out.println("4.SEARCH STUDENT");
			System.out.println("5.EXITING........");
			System.out.println("6.VIEW STUDENT");
			System.out.print("ENTER CHOICE:");
			int choice=sc.nextInt();
			switch(choice){
				case 1:{
					addStudent(sc);
					break;
				}
				case 2:{
					deleteStudent(sc);
					break;
				}
				case 3:{
					updateStudent(sc);
					break;
				}
				case 4:{
					searchStudent(sc);
					break;
				}
				case 5:{
					System.out.println("exiting!");
					break;
				}
				case 6:{
					viewStudent();
					break;
				}
				default:{
					System.out.println("Invalid choice!");
					break;
				}
			}
		}
	}
			public static void addStudent(Scanner sc) {
				System.out.print("ENTER ID:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("ENTER NAME:");
				String name=sc.nextLine();
				System.out.print("ENTER AGE:");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.print("ENTER DEPARTMENT:");
				String department=sc.nextLine();
				Student s=new Student(id,name,age,department);
				dao.addStudent(s);
			}
			public static void deleteStudent(Scanner sc) {
				System.out.print("ENTER ID:");
				int id=sc.nextInt();
				dao.deleteStudent(id);
			}
			public static void updateStudent(Scanner sc) {
				System.out.print("ENTER ID:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("ENTER NAME:");
				String name=sc.nextLine();
				System.out.print("ENTER AGE:");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.print("ENTER DEPARTMENT:");
				String department=sc.nextLine();
				Student s=new Student(id,name,age,department);
				dao.updateStudent(s);
			}
		    public static void searchStudent(Scanner sc) {
		    	System.out.print("ENTER ID:");
				int id=sc.nextInt();
				dao.searchStudent(id);
		    }
		    public static void viewStudent() {
		    	dao.viewStudent();
		    }

}
