package danli;
//����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ�����
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
