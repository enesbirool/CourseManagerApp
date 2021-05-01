package schoolKodlama.ioDemo;

public class Main {

	public static void main(String[] args) {
		Course course=new Course();
		course.id=1;
		course.name="ingilizce";
		
		Instructor instructor=new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.age=30;
		instructor.description="Harika Bir Eğitmen";
		instructor.nationalId="1231232";
		instructor.email="engin@gmail.com";
		instructor.password="12345";
		instructor.grade="Eğitmen";
		
		Student student=new Student();
		student.id=1;
		student.className="C3";
		student.studentNo="123123123";
		student.nationalId="123123123";
		student.firstName="mx";
		student.lastName="bozkurt";
		student.age=22;
		student.email="turkhacker@mxbozkurt.info";
		student.password="12345";
		student.grade="Öğrenci";
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student);
		studentManager.addCourse(student, instructor, course);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.addCourse(instructor, course);
	}

}
