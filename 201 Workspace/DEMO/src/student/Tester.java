package student;

import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {


		for(int count = 1; count>0; count++)
		{
			Scanner input = new Scanner(System.in);
			
			Student s1 = new Student("Test",16,100);
			System.out.println("Enter the student's name.");
			String name = input.nextLine();
			System.out.println("Enter the student's age.");
			int age = input.nextInt();
			System.out.println("Enter the student's mark.");
			int mark = input.nextInt();
			
			s1.setAge(age);
			s1.setName(name);
			s1.setMark(mark);
			
			System.out.println(s1.getName()   +  " " +  s1.getAge());
			System.out.println(s1.getAverage());
			
		}
		
		
	}

}