/*
메인메서드를 실행했을 때 아래와 같이 출력될 수 있도록 코드 작성

=============================================
티비 전원을 켭니다.
현재  TV  볼륨  :  20
현재  TV  채널  :  7
채널  36번으로  변경
채널  증가
현재  TV채널  :  38
볼륨  증가
현재  TV  볼륨  :  22
음소거
현재  TV  볼륨  :  0
TV  시청  종료
티비 전원을 끕니다.
=============================================
 */
package ch08_method.exam;

public  class  Quiz03  {
	public  static  void  main(String[]  args)  {
		TV  tv  =  new  TV();
		tv.powerOn();
		System.out.println("현재  TV  볼륨  :  "  +  tv.getVolume());
		System.out.println("현재  TV  채널  :  "  +  tv.getChannel());
		System.out.println("채널  36번으로  변경");
		tv.setChannel(36);
		System.out.println("채널  증가");
		tv.channelUp();
		tv.channelUp();
		System.out.println("현재  TV채널  :  "  +  tv.getChannel());
		System.out.println("볼륨  증가");
		tv.volumeUp();
		tv.volumeUp();
		System.out.println("현재  TV  볼륨  :  "  +  tv.getVolume());
		System.out.println("음소거");
		tv.mute();
		System.out.println("현재  TV  볼륨  :  "  +  tv.getVolume());
		System.out.println("TV  시청  종료");
		tv.powerOff();
		/*
		*/
	}
}