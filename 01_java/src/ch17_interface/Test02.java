/**
 * 
 * 인터페이스에 선언되는 모든 변수는 상수로 인식(public static final 키워드 자동으로 선언)
 * 인터페이스에 선언되는 모든 메서드는 추상 메서드로 인식(public abstract 키워드 자동으로 선언)
 * 
 */
package ch17_interface;
interface ServerInfo {
	String IP = "192.168.0.172";
//	public static final String IP = "192.168.0.172";
	void info(); 
//	public abstract void info() {} 에러 (바디가 있기 때문에)
}
public class Test02 {
	public static void main(String[] args) {
		//static 화기인
		System.out.println(ServerInfo.IP);
		
		//final 확인
//		ServerInfo.IP = "203.211.192.111";
		
	}
}
