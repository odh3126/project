/**
    실행시 아래와 같은 결과가 출력될 수 있도록 Time 클래스 작성
  
  - 출력결과>
    1. 시간, 분, 초 값 없는 경우 ----------------------
	00:00:00
	12:00:00(AM)
	2. 시간 값 있고 분, 초 값 없는 경우 ----------------------
	02:00:00
	02:00:00(AM)
	3. 시간, 분 값 있고 초 값 없는 경우 ----------------------
	16:30:00
	04:30:00(PM)
	4. 시간, 분, 초 값 변경 후 ----------------------
	10:10:10
	10:10:10(AM)
	5. 시간, 분, 초 모두 값이 있는 경우 ----------------------
	16:30:33
	04:30:33(PM)
	6. 시간, 분, 초 모두 값이 유효하지 않은 경우 ----------------------
	00:00:00
	12:00:00(AM)
	7. 기존 생성된 시간을 넘긴 경우 ----------------------
	16:30:33
	04:30:33(PM)
 */
package ch12_constructor.exam;

public class Quiz04 {
	public static void main(String[] args) {
		Time t1 = new Time();
		System.out.println("1. 시간, 분, 초 값 없는 경우 ----------------------");
		System.out.println(t1.toUnivTime());  // 00:00:00
		System.out.println(t1.toStanTime());  // 12:00:00(AM)
		
		Time t2 = new Time(2);           
		System.out.println("2. 시간 값 있고 분, 초 값 없는 경우 ----------------------");
		System.out.println(t2.toUnivTime());  // 02:00:00
		System.out.println(t2.toStanTime());  // 02:00:00(AM)

		Time t3 = new Time(16, 30);      
		System.out.println("3. 시간, 분 값 있고 초 값 없는 경우 ----------------------");
		System.out.println(t3.toUnivTime());  // 16:30:00
		System.out.println(t3.toStanTime());  // 04:30:00(PM)
		
		t3.setHour  (10);
		t3.setMinute(10);
		t3.setSecond(10);
		
		System.out.println("4. 시간, 분, 초 값 변경 후 ----------------------");
		System.out.println(t3.toUnivTime());  // 10:10:10
		System.out.println(t3.toStanTime());  // 10:10:10(AM)

		Time t4 = new Time(16, 30, 33); 
		System.out.println("5. 시간, 분, 초 모두 값이 있는 경우 ----------------------");
		System.out.println(t4.toUnivTime());  // 16:30:33
		System.out.println(t4.toStanTime());  // 04:30:33(PM)

		Time t5 = new Time(70, 70, 70); 
		System.out.println("6. 시간, 분, 초 모두 값이 유효하지 않은 경우 ----------------------");
		System.out.println(t5.toUnivTime());  // 00:00:00
		System.out.println(t5.toStanTime());  // 12:00:00(AM)

		Time t6 = new Time(t4);          
		System.out.println("7. 기존 생성된 시간을 넘긴 경우 ----------------------");
		System.out.println(t6.toUnivTime());  // 16:30:33
		System.out.println(t6.toStanTime());  // 04:30:33(PM)
	}
}













