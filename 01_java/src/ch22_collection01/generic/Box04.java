/**
 * Generic 클래스 선언하기
 * 
 * class 클래스이름<파라미터>  컴파일 할때 결정
 * 
 *  생성 : new 클래스이름<파라미터에 들어간 데이터 타입>();
 *  
 * 파라미터 이름으로 권장(1차 권장타입)
 * T : Type
 * E : Element (여러개의 형태를 관리)
 * K : Key (구분할때 사용)
 * V : Value (값)
 * N : Number (넘버)
 */
package ch22_collection01.generic;

public class Box04<K, V> {
	private K key;
	private V value;

	public Box04(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
