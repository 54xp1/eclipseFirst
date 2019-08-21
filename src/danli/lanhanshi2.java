package danli;
// 懒汉式  线程安全  效率低
public class lanhanshi2 {
	private static lanhanshi2 instance;
	private lanhanshi2() {}
	
	public static synchronized lanhanshi2 getInstance() {
		if(instance == null) {
			instance = new lanhanshi2();
		}
		return instance;
	}
}
