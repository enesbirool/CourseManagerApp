package schoolKodlama.ioDemo;

public class StudentManager extends UserManager{
	public void completedCourse(Student student) {
		System.out.println(student +" isimli öðrenci kursu tamamlayýp certifica almýþtýr");
	}
	
	public void addCourse(Student student,Instructor intructor,Course course) {
		System.out.println(student.firstName+" Ýsimli Öðrencimiz "+course.name+" Kursuna Kaydý Gerçekleþmiþtir Öðretmeniniz "+intructor.firstName+"'dýr");
	}
}
