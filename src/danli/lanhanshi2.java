package danli;
// ����ʽ  �̰߳�ȫ  Ч�ʵ�
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
