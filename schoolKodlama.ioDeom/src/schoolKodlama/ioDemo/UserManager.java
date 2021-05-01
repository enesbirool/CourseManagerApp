package schoolKodlama.ioDemo;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.grade+" Eklendi : "+user.firstName);
	}
	public void Delete(User user) {
		System.out.println(user.grade+" Silindi : "+user.firstName);
	}
	public void Update(User user) {
		System.out.println(user.grade+" Güncellendi : "+user.firstName);
	}
}
