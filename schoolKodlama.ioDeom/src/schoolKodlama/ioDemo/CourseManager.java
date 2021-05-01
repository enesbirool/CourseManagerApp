package schoolKodlama.ioDemo;

public class CourseManager {
	public void Add(Course course) {
		System.out.println("Kurs Eklendi "+ course);
	}
	public void Delete(Course course) {
		System.out.println("Kurs Silindi "+ course);
	}
	public void Update(Course course) {
		System.out.println("Kurs Güncellendi "+ course);
	}
}
