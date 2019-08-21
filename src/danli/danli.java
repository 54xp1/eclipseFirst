package danli;
//采用双锁机制，安全且在多线程情况下能保持高性能
public class danli {
	private static danli instance;
	private danli() {}
	
	public static synchronized danli getInstance() {
		if(instance == null) {
			synchronized (danli.class) {
				if(instance == null) {
					instance = new danli();
				}
			}
			
		}
		return instance;
	}
}
