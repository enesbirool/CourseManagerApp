package schoolKodlama.ioDemo;

public class StudentManager extends UserManager{
	public void completedCourse(Student student) {
		System.out.println(student +" isimli ��renci kursu tamamlay�p certifica alm��t�r");
	}
	
	public void addCourse(Student student,Instructor intructor,Course course) {
		System.out.println(student.firstName+" �simli ��rencimiz "+course.name+" Kursuna Kayd� Ger�ekle�mi�tir ��retmeniniz "+intructor.firstName+"'d�r");
	}
}
