package ch22_collection01.generic;

public class Test02 {
	public static void main(String[] args) {
		Box02 box = new Box02();
		// 장점 : 다양한 데이터 타입의 값을 담는다.
		box.setData("귤");
		box.setData(100);
		
		// 형변환을 이용해서 데이터를 가져와야 한다.
		int data = (Integer)box.getData();
		
		// 원하지 않는 데이터 타입이 입력되는 것을 막을 수 없다.
		box.setData("사과");
		
		//실행시에 에러가 발생 : 컴파일 시에 체크 불가능
		data = (Integer)box.getData();
	}

}
