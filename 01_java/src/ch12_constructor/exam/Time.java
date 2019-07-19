package ch12_constructor.exam;

public class Time {
	// 시간, 분, 초 의 값을 저장하는 멤버변수 선언
	private int hour;     // 0 - 23
	private int minute;   // 0 - 59
	private int second;   // 0 - 59
			
	Time() {
		this(0, 0, 0);
	}

	Time(int hour) {
		this(hour, 0, 0);
	}
	
	Time(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	Time(Time time) {
		this(time.hour, time.minute, time.second);

	}
	
	Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	void setTime(int hour, int minute, int second) {
		setHour  (hour);
		setMinute(minute);
		setSecond(second);
	}
			
	void setHour(int hour) {
		this.hour = (hour >= 0 && hour < 24) ? hour : 0;
	}
	void setMinute(int minute) {
		this.minute = (minute >= 0 && minute < 60) ? minute : 0;
	}
	void setSecond(int second) {
		this.second = (second >= 0 && second < 60) ? second : 0;
	}
	
	String toUnivTime() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
			
	String toStanTime() {
		return String.format(
				"%02d:%02d:%02d%s", 
				(hour == 12 || hour == 0) ? 12 : hour % 12, 
				minute, 
				second, 
				hour < 12 ? "(AM)" : "(PM)"
		);
	}
}























