package danli;
// ����ʽ  �̰߳�ȫ Ч�ʸ�  �ײ�������  ***
public class ehanshi {
	private static ehanshi instance = new ehanshi();
	private ehanshi() {}
	public static ehanshi getInstance() {
		return instance;
	}
	
}
