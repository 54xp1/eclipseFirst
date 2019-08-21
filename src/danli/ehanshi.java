package danli;
// 饿汉式  线程安全 效率高  易产生垃圾  ***
public class ehanshi {
	private static ehanshi instance = new ehanshi();
	private ehanshi() {}
	public static ehanshi getInstance() {
		return instance;
	}
	
}
