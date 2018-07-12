package com.ShallowDeepCopy;

public class DeepCopy {

	public static void main(String[] args) {
		
		Course science = new Course("Physics","Chemestry","Biology");
		Student student1 = new Student(11, "Chaman", science);
		Student student2 = null;
		
		try{
			//creating a clone of student1	and  assigning it to student2
			student2 = (Student)student1.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		//printing the subject3 of student1
		System.out.println(student1.course.subject3);//Biology
		//changin the subject3 of  of student2
		student2.course.subject3 = "Maths";
		//this change will be reflected in original student 'student1'
		System.out.println(student1.course.subject3);//Maths
	}
}
