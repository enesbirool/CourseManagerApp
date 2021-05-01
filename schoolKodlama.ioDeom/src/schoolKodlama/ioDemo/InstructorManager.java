package schoolKodlama.ioDemo;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor,Course course) {
		System.out.println(instructor.firstName+" "+"Ýsimli Eðitmene "+course.name+" Ýsimli Kurs Eklenmiþtir");
	}
	
	public void getDescription(Instructor instructor) {
		System.out.println(instructor.firstName+" Ýsimli Eðitmenin Açýklamasý : "+instructor.description);
	}
	
}
