package schoolKodlama.ioDemo;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor,Course course) {
		System.out.println(instructor.firstName+" "+"�simli E�itmene "+course.name+" �simli Kurs Eklenmi�tir");
	}
	
	public void getDescription(Instructor instructor) {
		System.out.println(instructor.firstName+" �simli E�itmenin A��klamas� : "+instructor.description);
	}
	
}
