package co.binarylife.inheritance;

import co.binarylife.inheritance.person.Person;
import co.binarylife.inheritance.person.Student;
import co.binarylife.inheritance.person.StudentTmpl;
import co.binarylife.inheritance.person.Teacher;
import co.binarylife.inheritance.person.TeacherTmpl;

public class MainEntry {
	
	public static void main(String[] args) {
		Person p1, p2;
		Teacher t = new TeacherTmpl("Ilker", "Java");
		Student s = new StudentTmpl("Zachary Baugh", "Java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("p1: " + p1.getName() + "\np2: " + p2.getName());
		
	}
	
}
