package com.neotech.review04;

public class School {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "John";
		student1.gradeLevel = 10;
		student1.studentNr = 46;
		
		student2.name = "Kate";
		student2.gradeLevel = 8;
		student2.studentNr = 47;
		
		student1.study();
		
		student2.sleep();
		
		Teacher teacher1 = new Teacher();
		
		teacher1.name = "James";
		teacher1.salary = 75000;
		teacher1.subject = "Physics";
		
		teacher1.teach();
		teacher1.yellAtStudent("Elon Musk");
	}

}
